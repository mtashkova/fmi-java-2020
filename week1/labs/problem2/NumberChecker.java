package problem2;

public class NumberChecker {
    public String palindromeCheck(int original) {
        //declaration
        int originalNumber;
        int digit1,
                digit2,
                digit3,
                digit4,
                digit5;
        //initialization
        originalNumber = original;
        digit5 = original % 10;
        original /= 10;
        digit4 = original % 10;
        original /= 10;
        digit3 = original % 10;
        original /= 10;
        digit2 = original % 10;
        original /= 10;
        digit1 = original % 10;
        original /= 10;
        //processing
        if(digit1!=digit5 || digit2 != digit4) {
            return "The number is not a palindrome";
        }
        return "The number is a palindrome";
    }
}
