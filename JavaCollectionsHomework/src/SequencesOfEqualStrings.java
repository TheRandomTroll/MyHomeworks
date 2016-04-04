import java.util.ArrayList;
import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String[] arr = reader.nextLine().split(" ");

        while (arr.length > 0) {
            // This string takes the first element of the array in order to check for identical ones.
            String checkingString = arr[0];

            ArrayList<String> equalStrings = new ArrayList<>();
            equalStrings.add(checkingString);

            for (int i = 1; i < arr.length; i++) {
                if (checkingString.equals(arr[i])) {
                    equalStrings.add(arr[i]);
                }
            }

            ArrayList<String> tempArr = new ArrayList<>();

            for (String s : arr) {
                if (!s.equals(checkingString)){
                    tempArr.add(s);
                }
            }
            arr = tempArr.toArray(new String[tempArr.size()]);

            for (String str : equalStrings) {
                System.out.printf("%s ", str);
            }

            System.out.println();
            equalStrings.clear();
        }
    }
}
