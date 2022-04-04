import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPatterns {

    static final Pattern names = Pattern.compile("^[A-Z][a-z]{3,}$");
    static final Pattern email = Pattern.compile("^abc(['.''\\-''+']?)(['a-zA-Z0-9']*)@bl.co(['.']?)([a-z]*)$");
    static final Pattern phone = Pattern.compile("^([+]\\d{2})?\\d{10}$");
    static final Pattern password = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}$");
    //For Password Validation.
//    (?=.*[0-9]) represents a digit must occur at least once.
//    (?=.*[a-z]) represents a lower case alphabet must occur at least once.
//    (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
//    (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
//    (?=\\S+$) white spaces don’t allowed in the entire string.
//   .{8,} represents at least 8 characters.


    public static boolean check(String inputs) {
        return names.matcher(inputs).matches();
    }
    public static boolean mail(String mail){
        return email.matcher(mail).matches();

    }
    public static boolean mobile(String mobile){
        return phone.matcher(mobile).matches();
    }
    public static boolean passwords(String pass){
        return password.matcher(pass).matches();
    }
}
