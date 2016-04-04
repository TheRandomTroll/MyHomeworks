import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int target = reader.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 20; j >= -20; j--) {

                if (i + j == target && j != 0){
                    char operator = '+';
                    if (j < 0){
                        operator = '-';
                    }
                    System.out.printf("%d %c %d = %d\n", i, operator, Math.abs(j), target);
                    break;
                }

            }
        }
    }
}
