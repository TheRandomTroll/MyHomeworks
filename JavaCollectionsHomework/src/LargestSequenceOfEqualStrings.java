import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestSequenceOfEqualStrings {

    static ArrayList<String> largestSequence = new ArrayList<>();
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

           if (equalStrings.size() > largestSequence.size()){
               largestSequence.clear();
               largestSequence.addAll(equalStrings.stream().collect(Collectors.toList()));
           }
            equalStrings.clear();
        }

        System.out.println(largestSequence);
    }
}
