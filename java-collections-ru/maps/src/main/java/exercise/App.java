package exercise;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> occurrences = new HashMap<String, Integer>();
        String[] words = sentence.split(" ");
        for ( String word : words) {
            Integer count = occurrences.get(word);
            if ( count == null ) {
                count = 0;
            }
            occurrences.put(word, count + 1);
        }
        System.out.println(occurrences);
        return occurrences;
    }

    public static String toString(Map<String, Integer> occurrences) {
        String result = "";
        for (Map.Entry<String, Integer> entry: occurrences.entrySet()) {
            entry.setValue(entry.getValue());
            result += "  " + entry.getKey() + ": " + entry.getValue() + "\n";

        }
        String newResult = "{\n" + result + "\n}";
        System.out.println(newResult);
        return newResult;
    }
}

//END
