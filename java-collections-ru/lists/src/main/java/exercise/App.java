package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static Boolean scrabble(String letters, String word)  {
        String[] lettersArr = letters.split("");
        String[] wordArr = word.toLowerCase().split("");
        List<String> lettersList = Arrays.asList(lettersArr);
        List<String> wordList = Arrays.asList(word);
        var i = 0;
        while (i < wordList.size()) {
            if (!lettersList.contains(wordList.get(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

}
//END
