import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println(Factorial(n));
    }

    static long Factorial(long n) {
        if(n == 1){
            return 1;
        }

        return n * Factorial(n - 1);
    }
}
