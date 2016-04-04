import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("a = ");
        float a = reader.nextFloat();
        System.out.print("b = ");
        float b = reader.nextFloat();
        System.out.print("c = ");
        float c = reader.nextFloat();

        System.out.println(getAverage(a, b, c));
    }

    private static String getAverage(float a, float b, float c){
        double avg = (a + b + c) / 3;
        return String.format("avg = %.2f", avg);
    }
}
