import java.util.Scanner;

public class DecimalToBase7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        while(a != 0) {
            sb.append(a % 7);
            a /= 7;
        }

        System.out.println(sb.reverse().toString());
    }
}
