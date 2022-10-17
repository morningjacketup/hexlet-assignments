package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
    public class App {
        public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
            List<Map<String, String>> result = new ArrayList<>();

            for (var item : books) {
                boolean isHere = true;
                for (Map.Entry<String, String> entry : where.entrySet()) {
                    if (!item.getOrDefault(entry.getKey(), "").equals(entry.getValue())) {
                        isHere = false;
                }
            }
                if (isHere) {
                    result.add(item);
                }
            }
            return result;
        }
    }
//END
