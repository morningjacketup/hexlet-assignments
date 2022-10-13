package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
    class App {
        public static Map<String, Integer> getWordCount(String sentense) {

            Map<String, Integer> wordsCount = new HashMap<>();

            if (sentense.isEmpty()) {
                return wordsCount;
            }

            String[] words = sentense.split(" ");

            for (int i = 0; i < words.length; i++) {
                int counter = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        counter++;
                    }
                }
                wordsCount.put(words[i], counter);
            }
            return wordsCount;
        }

    public static String toString(Map<String, Integer> dictionary) {
        String values = "";

        for (var item : dictionary.entrySet()) {
            values += "  " + item.getKey() + ": " + item.getValue() + "\n";
        }

        return "{\n" +
                values +
                "\n}";
    }
}
//END
