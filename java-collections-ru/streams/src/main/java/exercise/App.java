package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        return (int) emails.stream()
                .map(x -> x.substring(x.indexOf("@") + 1).trim())
                .filter(s -> s.equals("gmail.com") || s.equals("hotmail.com") || s.equals("yandex.ru"))
                .count();
    }
}
// END
