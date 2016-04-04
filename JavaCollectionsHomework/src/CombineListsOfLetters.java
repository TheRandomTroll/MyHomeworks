import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] firstLine = reader.nextLine().split(" ");
        String[] secondLine = reader.nextLine().split(" ");

        String finalOutput = "";
        for (String s : firstLine) {
            finalOutput += s + ' ';
        }

        Set<String> uniqueCharacters = new HashSet<String>(Arrays.asList(firstLine));

        for (String s : secondLine) {
            if (!uniqueCharacters.contains(s)){
                finalOutput += s + ' ';
            }
        }

        System.out.println(finalOutput);
    }
}