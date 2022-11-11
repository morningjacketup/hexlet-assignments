package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
 class App {
     public static List<String> buildAppartmentsList(List<Home> appartments, int n) {
        appartments.sort(Home::compareTo);
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            result.add(appartments.get(i).toString());
        }
        return result;
    }
}
// END
