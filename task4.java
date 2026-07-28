import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String originalString = scanner.nextLine();

        StringBuilder sb = new StringBuilder(originalString);
        sb.reverse();

        String reverseString = sb.toString();

        if (originalString.equals(reverseString)) {
            System.out.println("The input string us a palidrome.");
        } else {
            System.out.println("The input string is not a palidrome");
        }

        scanner.close();
    }
}
