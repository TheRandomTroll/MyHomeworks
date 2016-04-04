import java.util.Arrays;
import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] arr = Arrays.stream(reader.nextLine().split(""))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        String finalOutput = "";
        for (int i : arr) {
            switch (i) {
                case 0:
                    finalOutput += "Gee";
                     break;
                case 1:
                    finalOutput += "Bro";
                    break;
                case 2:
                    finalOutput += "Zuz";
                    break;
                case 3:
                    finalOutput += "Ma";
                    break;
                case 4:
                    finalOutput += "Duh";
                    break;
                case 5:
                    finalOutput += "Yo";
                    break;
                case 6:
                    finalOutput += "Dis";
                    break;
                case 7:
                    finalOutput += "Hood";
                    break;
                case 8:
                    finalOutput += "Jam";
                    break;
                case 9:
                    finalOutput += "Mack";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid number.");
            }
        }

        System.out.println(finalOutput);
    }
}
