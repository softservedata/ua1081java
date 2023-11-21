package PracticalTasks11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RequiresValidation {
    public static void main(String[] args) {
        String[] usernames = {"user123", "Oleg_Lyashko1977", "VeTall777", "Ze.Team", "kiwi"};

        for (String username : usernames) {
            boolean isValid = requiresUserName(username);
            System.out.println("The username '" + username + "' is valid? " + isValid);
        }

    }
    private static boolean requiresUserName(String username){
        String regex = "[A-Za-z_0-9]{3,15}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(username);
        return m.matches();
    }
}
