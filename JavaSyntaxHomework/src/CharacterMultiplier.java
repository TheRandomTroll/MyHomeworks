import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String str1 = reader.next();
        String str2 = reader.next();

        System.out.println(evaluateExpression(str1, str2));

    }

    static int evaluateExpression(String str1, String str2) {
        int totalSum = 0;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }
        } else if (str1.length() > str2.length()) {
            for (int i = 0; i < str2.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }

            for (int i = str2.length(); i < str1.length(); i++) {
                totalSum += str1.charAt(i);
            }
        } else {
            for (int i = 0; i < str1.length(); i++) {
                totalSum += str1.charAt(i) * str2.charAt(i);
            }

            for (int i = str1.length(); i < str2.length(); i++) {
                totalSum += str1.charAt(i);
            }
        }

        return totalSum;
    }
}
