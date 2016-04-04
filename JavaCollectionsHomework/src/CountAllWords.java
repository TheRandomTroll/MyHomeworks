import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        Pattern pattern = Pattern.compile("(\\b[a-zA-z]+\\b)");
        Matcher matcher = pattern.matcher(input);

       int count = 0;

        while(matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}
