package problem4;

public class GeneticInformation {
    public void convertDigits(int number) {
        //declaration
        int[] digit = new int[4];
        String str;
        //initialization
        str = "";
        digit[3] = number%10;
        number/=10;
        digit[2] = number%10;
        number/=10;
        digit[1] = number%10;
        number/=10;
        digit[0] = number%10;
        number/=10;
        // processing
        for(int i=0; i<4 ;i++) {
            switch(digit[i]) {
                case 0 : str = str.concat("A");
                    break;
                case 1 : str = str.concat("C");
                    break;
                case 2 : str = str.concat("G");
                    break;
                case 3 : str = str.concat("T");
                    break;
            }
        }
        System.out.printf("The nucleotide is: %s", str);
    }
}
