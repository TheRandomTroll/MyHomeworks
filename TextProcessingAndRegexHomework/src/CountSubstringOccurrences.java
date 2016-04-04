import java.util.Scanner;
import java.util.regex.*;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String substring = reader.nextLine();
        String pattern = String.format("(?=(%s))", substring);
        Matcher matcher = Pattern.compile(pattern).matcher(input.toLowerCase());
        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
