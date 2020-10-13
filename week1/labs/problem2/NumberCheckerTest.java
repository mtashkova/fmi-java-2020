package problem2;

import java.util.Scanner;

public class NumberCheckerTest {
    public static void main(String[] args) {
        //declaration
        Scanner kdb = new Scanner(System.in);
        NumberChecker nc = new NumberChecker();
        int originalNumber;
        //initialization
        System.out.print("Enter a 5-digit number: ");
        originalNumber = kdb.nextInt();
        if (originalNumber < 10000 || originalNumber > 99999) {
            System.out.println("Wrong input");
            return;
        }
        String result = nc.palindromeCheck(originalNumber);
        System.out.println(result);
    }
}
