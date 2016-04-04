import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] input = reader.nextLine().split(" ");
        List<String> result = Arrays.stream(input).filter(t -> t.length() > 3).collect(Collectors.toList());
        if (result.size() == 0){
            System.out.println("(empty)");
        }else{
            result.stream().forEach(e -> System.out.print(e + ' '));
            System.out.println();
        }
    }
}
