package exercise;

import lombok.Data;
import lombok.NonNull;

// BEGIN

// END
@Data
class User {
    @NonNull
    int id;
    @NonNull
    String firstName;
    @NonNull
    String lastName;
    @NonNull
    int age;
}
