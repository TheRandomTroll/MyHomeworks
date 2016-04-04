import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = reader.nextInt();

        if (x > 26){
            throw new IllegalArgumentException("Value of x cannot be greater than 26.");
        }
        for (int i = 0; i < x; i++) {
            for (char j = 'a'; j <= 'a' + i; j++) {
                String s = String.valueOf(j);
                System.out.print(s + " ");
            }
            System.out.println();
        }

        for (int i = x - 1; i >= 0; i--) {
            for (char j = 'a'; j < 'a' + i; j++) {
                String s = String.valueOf(j);
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
