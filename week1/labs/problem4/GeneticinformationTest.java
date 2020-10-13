package problem4;

import java.util.Scanner;

public class GeneticinformationTest {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        int number;
        GeneticInformation gi = new GeneticInformation();
        System.out.print("Enter a 4-digit number: ");
        number = kdb.nextInt();
        gi.convertDigits(number);
    }
}
