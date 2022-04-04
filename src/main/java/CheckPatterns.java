import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPatterns {

    static Pattern names = Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern email = Pattern.compile("^abc(['.''\\-''+']?)(['a-zA-Z0-9']*)@bl.co(['.']?)([a-z]*)$");
    static Pattern number1 = Pattern.compile("^([+]\\d{2})?\\d{10}$");
    static Pattern password = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}$");
    //For Password Validation.
//    (?=.*[0-9]) represents a digit must occur at least once.
//    (?=.*[a-z]) represents a lower case alphabet must occur at least once.
//    (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//    (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//    (?=\\S+$) white spaces don’t allowed in the entire string.
//   .{8, 20} represents at least 8 characters.


    public static void check(String inputs) {
        Matcher matcher1 = names.matcher(inputs);
        if (matcher1.matches())
            System.out.print("");
        else
            System.out.println("Invalid Type");
    }
    public static void mail(String mail){
        Matcher matcher2 = email.matcher(mail);
        if (matcher2.matches())
            System.out.print("");
        else
            System.out.println("Invalid Type");

    }
    public static void mobile(String mobile){
        Matcher matcher3 = number1.matcher(mobile);
        if (matcher3.matches())
            System.out.print("");
        else
            System.out.println("Invalid Type");

    }
    public static void passwords(String pass){
        Matcher matcher4 = password.matcher(pass);
        if (matcher4.matches())
            System.out.print("");
        else
            System.out.println("Invalid Type");
    }
}
