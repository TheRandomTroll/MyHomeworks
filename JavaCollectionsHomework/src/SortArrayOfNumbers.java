import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int arrayCapacity = reader.nextInt();
        int[] arr = new int[arrayCapacity];
        for (int i = 0; i < arrayCapacity; i++) {
            arr[i] = Integer.parseInt(reader.next());
        }

        Arrays.sort(arr);
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i : arr) {
            sj.add(Integer.toString(i));
        }

        System.out.println(sj.toString());
    }
}
