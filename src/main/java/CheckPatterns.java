
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CustomException extends Exception {
    public CustomException(String message) {
        // call the constructor of Exception class
        super(message);
    }
}

interface Check{
    public boolean names(String names) throws CustomException;
}

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


    public static boolean check(String inputs) throws CustomException {
        Check check1 = (name) -> {
            Matcher matcher = names.matcher(inputs);
            if (matcher.matches())
                return names.matcher(inputs).matches();
            else
                throw new CustomException(inputs + " Invalid input");
        };
        return false;
    }
    public static boolean mail(String mail)throws CustomException{
        Check check1 = (name) -> {
            Matcher matcher = email.matcher(mail);
            if (matcher.matches())
                return email.matcher(mail).matches();
            else
                throw new CustomException(mail + " Invalid input");
        };
        return false;
    }
    public static boolean mobile(String mobile) throws CustomException {
        Check check1 = (name) -> {
            Matcher matcher = phone.matcher(mobile);
            if (matcher.matches())
                return phone.matcher(mobile).matches();
            else
                throw new CustomException(mobile + " Invalid input");
        };
        return false;
    }
    public static boolean passwords(String pass) throws CustomException {
        Check check1 = (name) -> {
            Matcher matcher = password.matcher(pass);
            if (matcher.matches())
                return password.matcher(pass).matches();
            else
                throw new CustomException(pass + " Invalid input");
        };
        return false;
    }
}
