import java.text.MessageFormat;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = reader.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.println(String.format("The total sum of the numbers (1-%d) is: %d", x, sum));
    }
}

