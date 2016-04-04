import com.sun.javaws.exceptions.InvalidArgumentException;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) throws InvalidArgumentException {
        Scanner reader = new Scanner(System.in);
        String firstString = reader.next();
        String secondString = reader.next();
        System.out.println(areExchangeable(firstString, secondString));
    }

    static boolean areExchangeable(String a, String b) throws InvalidArgumentException {
        if (a.length() != b.length()) {
            throw new InvalidArgumentException(new String[]{"Words must be with equal length"});
        } else {
            HashMap<Character, Character> magicWordsChecker = new HashMap();
            for (int i = 0; i < a.length(); i++) {
                char firstWordCharacter = a.charAt(i);
                char secondWordCharacter = b.charAt(i);
                if (!magicWordsChecker.containsKey(firstWordCharacter)){
                    magicWordsChecker.put(firstWordCharacter, secondWordCharacter);
                }
                else{
                    if (!magicWordsChecker.get(firstWordCharacter).equals(secondWordCharacter)){
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
