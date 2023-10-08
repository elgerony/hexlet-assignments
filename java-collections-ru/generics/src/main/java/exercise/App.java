package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;,

public class App{
    static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> description) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean isMatch = true;

            for (Map.Entry<String, String> entry : description.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                result.add(book);
            }
        }

        return result;
    }
}


