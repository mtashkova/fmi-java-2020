package problem1;

public class Temperature {
    public double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = 9.0 /5.0 * celsius + 32;
        return fahrenheit;
    }
    public double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }
}
