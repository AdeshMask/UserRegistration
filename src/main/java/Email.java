import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String mail = scanner.next();
        checkMails(mail);
    }
    static boolean checkMails(String mail) {
        Pattern pattern = Pattern.compile("^abc(['.''\\-''+']?)(['a-zA-Z0-9']*)@bl.co(['.']?)([a-z]*)$");
        return pattern.matcher(mail).matches();
    }
}