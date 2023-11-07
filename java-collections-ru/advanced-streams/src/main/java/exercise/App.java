package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String data)  {
        String result = Arrays.stream(data.split(System.lineSeparator()))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.substring(line.indexOf('"') + 1, line.lastIndexOf('"')))
                .flatMap(line -> {
                    String[] split = line.split(",");
                    return Arrays.stream(split);
                })
                .filter(key -> key.startsWith("X_FORWARDED_"))
                .map(key -> key.replace("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
        return result;
    }

}
//END
