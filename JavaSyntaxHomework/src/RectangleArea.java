import java.util.Arrays;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arr = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        int area = arr[0] * arr[1];
        System.out.println(area);
    }
}
