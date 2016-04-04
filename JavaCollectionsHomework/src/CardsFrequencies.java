import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardsFrequencies {
    public static void main(String[] args) {
        final String[] allCardTypes = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        Pattern pattern = Pattern.compile("([^♥♣♦♠\\s]+)");
        Matcher matcher = pattern.matcher(input);

        ArrayList<String> arrayList = new ArrayList<>();

        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }

        Map<String, Float> cardsFrequency = new LinkedHashMap<>();

        for (int i = 0; i < allCardTypes.length; i++) {
            float currentCardTypeCount = 0;
            String currentCardType = allCardTypes[i];
            for (String s : arrayList) {
                if (s.equals(currentCardType)) {
                    currentCardTypeCount++;
                }
            }

            if (currentCardTypeCount != 0) {
                cardsFrequency.put(currentCardType, (currentCardTypeCount / arrayList.size()) * 100.0f);
            }
        }

        for (Map.Entry<String, Float> stringDoubleEntry : cardsFrequency.entrySet()) {
            System.out.println(String.format("%s -> %.2f", stringDoubleEntry.getKey(), stringDoubleEntry.getValue()) + '%');
        }
    }
}
