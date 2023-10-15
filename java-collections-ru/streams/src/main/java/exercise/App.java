package exercise;

import java.util.List;
import java.util.ArrayList;




// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emailList) {
        List<String> hostList = new ArrayList<>();
        String host;
        for (String email : emailList) {

            host = email.substring(email.indexOf('@') + 1);
            hostList.add(host);
        }

        long emailCount = hostList.stream()
                .filter(hostName -> hostName.equals("gmail.com") || hostName.equals("yandex.ru")
                        || hostName.equals("hotmail.com"))
                .count();
        return emailCount;
    }
}