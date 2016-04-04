import java.util.Scanner;

public class CalculateExpression {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("a = ");
        float a = reader.nextFloat();
        System.out.print("b = ");
        float b = reader.nextFloat();
        System.out.print("c = ");
        float c = reader.nextFloat();

        double firstExpression = calculateFirstExpression(a, b, c);
        double secondExpression = calculateSecondExpression(a, b, c);

        double difference = ((a + b + c) / 3) - ((firstExpression + secondExpression) / 2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstExpression, secondExpression, Math.abs(difference));
    }

    private static double calculateFirstExpression(float a, float b, float c) {
        return Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), (a + b + c) / Math.sqrt(c));
    }

    private static double calculateSecondExpression(float a, float b, float c){
        return Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3), a - b);
    }
}
