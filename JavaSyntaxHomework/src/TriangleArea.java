import java.util.Arrays;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] pointA = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        int[] pointB = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        int[] pointC = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();

        int area = Math.abs((pointA[0] * (pointB[1] - pointC[1]) +
                pointB[0] * (pointC[1] - pointA[1]) +
                pointC[0] * (pointA[1] - pointB[1])) / 2);

        System.out.println(area);
    }
}
