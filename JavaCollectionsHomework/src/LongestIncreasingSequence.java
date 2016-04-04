/************************\
| ! ! ! WARNING ! ! !    |
|  CHECK AT OWN RISK ! ! |
\********************** */

//region You have been warned.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LongestIncreasingSequence {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] arr = Arrays.stream(reader.nextLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> currentSequence = new ArrayList<>();
        ArrayList<Integer> longestSequence = new ArrayList<>();

        for (int i : arr) {
            if (currentSequence.size() != 0) {
                if (i <= currentSequence.get(currentSequence.size() - 1 < 0 ? 0 : currentSequence.size() - 1)) {
                    if (longestSequence.size() < currentSequence.size()) {
                        longestSequence.clear();
                        longestSequence.addAll(currentSequence.stream().collect(Collectors.toList()));
                    }

                    System.out.println(currentSequence);
                    currentSequence.clear();
                }
            }
            currentSequence.add(i);
        }

        if (longestSequence.size() < currentSequence.size()) {
            longestSequence.clear();
            longestSequence.addAll(currentSequence.stream().collect(Collectors.toList()));
        }

        System.out.println(currentSequence);
        System.out.println("Longest: " + longestSequence);
    }
}
//endregion
