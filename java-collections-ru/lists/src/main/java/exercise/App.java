package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static Boolean scrabble(String letters, String word)  {
        String[] lettersArr = letters.split("");
        List<String> lettersList = Arrays.asList(lettersArr);
        var i = 0;
        while (i < word.length()) {
            if (!letters.contains(word.indexOf(i).toLowCase())) {
                return false;
            }
            i++;
        }
        return true;
    }

}
//END
