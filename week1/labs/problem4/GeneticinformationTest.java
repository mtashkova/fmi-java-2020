package problem4;

import java.util.Scanner;

public class GeneticinformationTest {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        int number,
            convertedNumber;
        GeneticInformation gi = new GeneticInformation();
        System.out.print("Enter a number: ");
        number = kdb.nextInt();
        convertedNumber = gi.convertToFour(number);
        gi.convertDigits(convertedNumber);
    }
}
