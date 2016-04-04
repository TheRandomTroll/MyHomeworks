import java.util.Arrays;
import java.util.Scanner;

public class Base7ToDecimal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int a = reader.nextInt();

        int[] aToArray = Arrays.stream(Integer.toString(a).split("")).map(String::trim).mapToInt(Integer::parseInt).toArray();

        aToArray = reverse(aToArray);
        int aToDec = 0;
        for (int i = 0; i < aToArray.length; i++) {
            aToDec += aToArray[i] * Math.pow(7, i);
        }

        System.out.println(aToDec);
    }

    public static int[] reverse(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        return reversed;
    }
}
