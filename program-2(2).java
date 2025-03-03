import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);
        
        double converted = (unit == 'C' || unit == 'c') ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        String resultUnit = (unit == 'C' || unit == 'c') ? "Celsius" : "Fahrenheit";
        
        System.out.println("Converted Temperature: " + converted + " " + resultUnit);
        scanner.close();
    }
}