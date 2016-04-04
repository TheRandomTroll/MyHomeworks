import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int[] arr = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();

        if (arr.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                int a = arr[i];
                int b = arr[i + 1];

                if (a % 2 == 0 && b % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\n", a, b);
                } else if (a % 2 != 0 && b % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd\n", a, b);
                } else {
                    System.out.printf("%d, %d -> different\n", a, b);

                }
            }
        }
    }
}