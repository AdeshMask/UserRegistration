import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String mail = scanner.next();
        Pattern pattern = Pattern.compile("^abc(['.''\\-''+']?)(['a-zA-Z0-9']*)@bl.co(['.']?)([a-z]*)$");
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches())
            System.out.print("");
        else
            System.out.print("Invalid Type");
    }
}