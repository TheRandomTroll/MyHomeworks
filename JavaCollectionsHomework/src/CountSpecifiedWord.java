import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine().toLowerCase();
        String wordToSearchFor = reader.nextLine();
        Pattern pattern = Pattern.compile("(\\b[a-zA-z]+\\b)");
        Matcher matcher = pattern.matcher(input);

        int count = 0;

        while(matcher.find()) {
            if (matcher.group(1).equals(wordToSearchFor)){
                count++;
            }

        }

        System.out.println(count);
    }
}
