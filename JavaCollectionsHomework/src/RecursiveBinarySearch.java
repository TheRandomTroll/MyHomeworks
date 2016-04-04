import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int elementToFind = Integer.parseInt(reader.nextLine());
        int[] arr = Arrays.stream(reader.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(binarySearch(arr, elementToFind));
    }

    public static int binarySearch(int[] a, int target) {
        return binarySearch(a, 0, a.length-1, target);
    }

    public static int binarySearch(int[] a, int start, int end, int target) {
        int middle = (start + end) / 2;
        if(end < start) {
            return -1;
        }

        if(target==a[middle]) {
            return middle;
        } else if(target<a[middle]) {
            return binarySearch(a, start, middle - 1, target);
        } else {
            return binarySearch(a, middle + 1, end, target);
        }
    }
}
