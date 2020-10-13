package problem3;

public class PhoneCoding {
    public void encodePhone(int phoneNumber) {
        //declaration
        int digit1,
                digit2,
                digit3,
                digit4;
        //initialization
        //1234
        digit1 = phoneNumber / 1000;
        digit2 = (phoneNumber / 100) % 10;
        digit3 = (phoneNumber / 10) % 10;
        digit4 = phoneNumber % 10;
        System.out.printf("Original phone number: %d%d%d%d%n",
                digit1, digit2, digit3, digit4);

        //encode digits //0010 //8777
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;
        System.out.printf("Encoded phone number: %d%d%d%d%n",
                digit3, digit2, digit1, digit4);
    }

    public void decodePhone(int phoneNumber) {
        //declaration
        int digit1,
                digit2,
                digit3,
                digit4;
        //initialization
        //1234
        digit1 = phoneNumber / 1000;
        digit2 = (phoneNumber / 100) % 10;
        digit3 = (phoneNumber / 10) % 10;
        digit4 = phoneNumber % 10;
        System.out.printf("Encoded phone number: %d%d%d%d%n",
                digit1, digit2, digit3, digit4);

        //encode digits
        digit1 = (digit1 + 3) % 10; //1
        digit2 = (digit2 + 3) % 10;
        digit3 = (digit3 + 3) % 10;
        digit4 = (digit4 + 3) % 10;
        System.out.printf("Decoded phone number: %d%d%d%d",
                digit3, digit2, digit1, digit4);
    }
}
