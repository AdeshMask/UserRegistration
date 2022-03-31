import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPatterns {

    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");

    public static void check(String fname) {
        Matcher matcher1 = pattern.matcher(fname);
        if (matcher1.matches())
            System.out.println("True");
        else
        System.out.println("False");
    }
}
