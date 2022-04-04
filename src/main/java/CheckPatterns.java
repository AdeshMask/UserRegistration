import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPatterns {

    static Pattern names = Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern email = Pattern.compile("^abc(['.''\\-''+']?)(['a-zA-Z0-9']*)@bl.co(['.']?)([a-z]*)$");
    static Pattern number1 = Pattern.compile("^([+]\\d{2})?\\d{10}$");
    static Pattern password = Pattern.compile("^[a-zA-Z0-9'@''+''\\-''$''?''#''!''%''&''*']{8,}$");


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
