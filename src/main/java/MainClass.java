import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {



    public static void main(String[] args) {
        CheckPatterns checkPatterns = new CheckPatterns();
        System.out.println("Welcome to User Resgistration::");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First name:");
        String fname = scanner.nextLine();
        checkPatterns.check(fname);
    }

}
