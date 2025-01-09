import java.util.Scanner;

public class Demo019A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        
        int roundedNumber = ((number + 2) / 5) * 5;
        
        System.out.println("Rounded to the nearest multiple of 5: " + roundedNumber);
        
        scanner.close();
    }
}
