import java.util.*;

public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        List<Integer> allInts = new ArrayList<>();
        int n = reader.nextInt();
        int m = reader.nextInt();

        for (int i = n < m ? n : m; i <= (n < m ? m : n); i++) {
            allInts.add(i);
        }

        long seed = System.nanoTime();
        Collections.shuffle(allInts, new Random(seed));

        for (int integer : allInts){
            System.out.printf("%d ", integer);
        }
    }
}
