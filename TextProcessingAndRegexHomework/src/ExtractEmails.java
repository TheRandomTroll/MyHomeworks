import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        Pattern pattern = Pattern.compile("([a-z-._]+@[a-z-._]+\\.[a-z]+)|([a-z-.]+@[a-z-._]+\\.[a-z]+\\.[a-z]+)");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println(matcher.group(1));
        }

    }
}
