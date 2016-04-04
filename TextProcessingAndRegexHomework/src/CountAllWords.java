import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] input = reader.nextLine().split("\\W+");
        System.out.println(input.length);
    }
}
