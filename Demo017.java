import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 2-digit number: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            int digit1 = number / 10;
            int digit2 = number % 10;
            int sum = digit1 + digit2;
            System.out.println("The sum of the digits is: " + sum);
        } else {
            System.out.println("Please enter a valid 2-digit number.");
        }

        scanner.close();
    }
}