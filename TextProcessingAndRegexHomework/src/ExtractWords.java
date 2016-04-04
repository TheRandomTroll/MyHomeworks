import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        Matcher matcher = Pattern.compile("([A-z]+)").matcher(input);
        while(matcher.find()){
            System.out.print(matcher.group(1) + ' ');
        }
    }
}
