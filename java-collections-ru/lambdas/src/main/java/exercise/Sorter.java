package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
    class Sorter {
        public static List<String> takeOldestMans(List<Map<String, String>> users) {
            int[] arr = new int[10];
            final int length = arr.length;
            return users.stream()
                    .filter(x -> x.get("gender").equals("male"))
                    .sorted((user1, user2) -> {
                        LocalDate date1 = LocalDate.parse(user1.get("birthday"));
                        LocalDate date2 = LocalDate.parse(user2.get("birthday"));
                        return date1.compareTo(date2);
                    })
                    .map(user -> user.get("name"))
                    .collect(Collectors.toList());
        }
    }

// END
