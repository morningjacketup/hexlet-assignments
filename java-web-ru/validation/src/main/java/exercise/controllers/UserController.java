package exercise.controllers;

import io.javalin.http.Handler;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.javalin.core.validation.Validator;
import io.javalin.core.validation.ValidationError;
import io.javalin.core.validation.JavalinValidation;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.lang3.StringUtils;

import exercise.domain.User;
import exercise.domain.query.QUser;

public final class UserController {

    public static Handler listUsers = ctx -> {

        List<User> users = new QUser()
                .orderBy()
                .id.asc()
                .findList();

        ctx.attribute("users", users);
        ctx.render("users/index.html");
    };

    public static Handler showUser = ctx -> {
        long id = ctx.pathParamAsClass("id", Long.class).getOrDefault(null);

        User user = new QUser()
                .id.equalTo(id)
                .findOne();

        ctx.attribute("user", user);
        ctx.render("users/show.html");
    };

    public static Handler newUser = ctx -> {

        ctx.attribute("errors", Map.of());
        ctx.attribute("user", Map.of());
        ctx.render("users/new.html");
    };

    public static Handler createUser = ctx -> {
        // BEGIN
        String firstName = ctx.formParam("firstName");
        String lastName = ctx.formParam("lastName");
        String email = ctx.formParam("email");
        String password = ctx.formParam("password");

        Validator<String> validator = ctx.formParamAsClass("firstName", String.class)
                .check(it -> !it.isEmpty(), "Имя не должно быть пустым");

        Validator<String> lastNameValidator = ctx.formParamAsClass("lastName", String.class)
                .check(it -> !it.isEmpty(), "Фамилия не должна быть пустая");

        Validator<String> emailValidator = ctx.formParamAsClass("email", String.class)
                .check(it -> !EmailValidator.isValid(it), "Некорретный email");

        Validator<String> passwordValidator = ctx.formParamAsClass("password", String.class)
                .check(StringUtils::isNumeric, "Пароль должен быть из чисел")
                .check(it -> it.length() > 4, "Пароль должен быть длинее 4 чисел");


        Map<String, List<ValidationError<? extends Object>>> errors = JavalinValidation.collectErrors(
                validator,
                lastNameValidator,
                emailValidator,
                passwordValidator
        );

        if (!errors.isEmpty()) {
            ctx.status(422);
            ctx.attribute("errors", errors);
            User invalidUser = new User(firstName, lastName, email, password);
            ctx.attribute("user", invalidUser);
            ctx.render("/users/new");
        }

        User user = new User(firstName, lastName, email, password);
        user.save();

        ctx.redirect("/users");
    };

}
        // END
