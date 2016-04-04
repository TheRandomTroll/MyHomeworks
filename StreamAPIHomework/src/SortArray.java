import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Integer> list = Arrays.asList(reader.nextLine()
                .split(" "))
                .stream()
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        String orderType = reader.nextLine();
        switch (orderType) {
            case "Ascending":
                list.stream().sorted().forEach(e -> System.out.print(e + " "));
                break;
            case "Descending":
                Comparator<Integer> comp = (a, b) -> a.compareTo(b);
                list.stream().sorted(comp.reversed()).forEach(e -> System.out.print(e + " "));
                break;
        }
    }
}
