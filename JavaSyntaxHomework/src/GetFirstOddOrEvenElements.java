import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arr = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();

        String[] command = reader.nextLine().split(" ");


        System.out.println(getElements(arr, Integer.parseInt(command[1]), command[2]));

    }

    public static ArrayList<Integer> getElements(int[] array, int count, String numberType) {
        ArrayList<Integer> output = new ArrayList<>();

        // This integer traces when the number return limit was reached.
        int a = 0;

        for (int i : array) {
            if (a < count){
                switch (numberType){
                    case "odd":
                        if (i % 2 != 0){
                            output.add(i);
                        }
                        break;

                    case "even":
                        if (i % 2 == 0){
                            output.add(i);
                        }
                        break;
                }
                a++;
            }else {
                break;
            }
        }
        return output;
    }
}
