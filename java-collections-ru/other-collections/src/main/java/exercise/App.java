package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> aset, Map<String, Object> bset ) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        for (String key : aset.keySet()) {
            if (bset.containsKey(key)) {
                if (aset.get(key).equals(bset.get(key))) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            } else {
                result.put(key, "deleted");
            }
        }

        for (String key : bset.keySet()) {
            if (!aset.containsKey(key)) {
                result.put(key, "added");
            }
        }

        return result;
    }
}
//END
