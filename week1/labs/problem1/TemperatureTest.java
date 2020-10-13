package problem1;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        //declaration and initialization
        Temperature temperature = new Temperature();
        Scanner kbd = new Scanner(System.in);
        double cTemperature, //read celsius temperature
                fTemperature; // read fahrenheit temperature
        double convertToCelsius,
                convertToFahrenheit;
        //processing
        System.out.print("Enter celsius temperature: ");
        cTemperature = kbd.nextDouble();
        //convert temperature
        convertToFahrenheit = temperature.convertCelsiusToFahrenheit(cTemperature);
        System.out.print("Enter fahrenheit temperature: ");
        fTemperature = kbd.nextDouble();
        //convert temperature
        convertToCelsius = temperature.convertFahrenheitToCelsius(fTemperature);
        //output
        System.out.printf("Celsius: %.2f is Fahrenheit: %.2f%n",
                cTemperature, convertToFahrenheit);
        System.out.printf("Fahrenheit: %.2f is Celsius: %.2f%n",
                fTemperature, convertToCelsius);

    }
}
