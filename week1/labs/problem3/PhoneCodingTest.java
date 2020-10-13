package problem3;

import java.util.Scanner;

public class PhoneCodingTest {
    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        int phoneNumber,
            encodedPhoneNumber;
        PhoneCoding phone = new PhoneCoding();
        System.out.print("Enter phone number: ");
        phoneNumber = kdb.nextInt();
        phone.encodePhone(phoneNumber);
        System.out.print("Enter encoded phone number: ");
        encodedPhoneNumber = kdb.nextInt();
        phone.decodePhone(encodedPhoneNumber);
    }
}
