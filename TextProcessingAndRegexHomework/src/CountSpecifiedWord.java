import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] input = reader.nextLine().toLowerCase().split(" ");
        String substring = reader.nextLine();
        int count = 0;
        for (String s : input) {
            if (s == substring){
                count++;
            }
        }

        System.out.println(count);
    }
}
