import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPatterns {

    static Pattern names = Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern email = Pattern.compile("^([a-zA-Z0-9]*){3,}['.']{0,}['_']{0,}['-']{0,}['.']{0,}([a-zA-z0-9]*){1,}['@']([a-zA-Z]*){0,}['.'][a-z]{2,4}$");
    static Pattern number1 = Pattern.compile("^([+]\\d{2})?\\d{10}$");


    public static void check(String inputs) {
        Matcher matcher1 = names.matcher(inputs);
        Matcher matcher2 = email.matcher(inputs);
        Matcher matcher3 = number1.matcher(inputs);
        if (matcher1.matches())
            System.out.println("");
        else if (matcher2.matches())
            System.out.println("");
        else if (matcher3.matches())
                System.out.println("");
        else
            System.out.println("Invalid Input");
    }
}
