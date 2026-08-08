import java.util.Scanner;

public class task7 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double qoutient = divide(num1, num2);
        
        System.out.println("\nSum: " + formatResult(sum));
        System.out.println("Difference: " + formatResult(difference));
        System.out.println("Product: " + formatResult(product));

        if (Double.isNaN(qoutient)) {
            System.out.println("Quotient: Cannot divide by zero.");
        } else {
            System.out.println("Quotient: " + formatResult(qoutient));
        }

        scanner.close();
    }

        private static String formatResult(double result) {
            if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.valueOf(result);
        }
    }
    
}
