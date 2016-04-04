import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(input);

        Set hashSet = new HashSet<String>();

        while(matcher.find()){
            hashSet.add(matcher.group(1).toLowerCase());
        }

        TreeSet<String> sortedSet = new TreeSet<>();
        sortedSet.addAll(hashSet);
        System.out.println(sortedSet);
    }
}
