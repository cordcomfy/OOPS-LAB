import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        
        int largest = (a > b && a > c) ? a : (b > c ? b : c);
        
        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}
