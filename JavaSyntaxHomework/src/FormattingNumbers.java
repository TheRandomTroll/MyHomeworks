import java.text.DecimalFormat;
import java.util.Scanner;

public class FormattingNumbers {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("a (0-500) = ");
        int a = reader.nextInt();
        System.out.print("b = ");
        float b = reader.nextFloat();
        System.out.print("c = ");
        float c = reader.nextFloat();
        
        String aToHex = Integer.toHexString(a);
        String aToBin = Integer.toBinaryString(a);


        String finalOutput = "";
        finalOutput += '|';
        finalOutput += aToHex.toUpperCase();

        for (int i = 0; i < 10 - aToHex.length(); i++) {
            finalOutput += ' ';
        }

        finalOutput += '|';

        for (int i = 0; i < 10 - aToBin.length(); i++) {
            finalOutput += '0';
        }

        finalOutput += aToBin + '|';

        for (int i = 0; i < 10 - Float.toString(b).length(); i++) {
            finalOutput += ' ';
        }

        finalOutput += String.format("%.2f", b) + '|';
        finalOutput += String.format("%.3f", c);

        for (int i = 0; i < Float.toString(c).length(); i++) {
            finalOutput += ' ';
        }

        finalOutput += '|';

        System.out.println(finalOutput);
    }
}
