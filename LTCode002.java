import java.util.Scanner;

class Solution {
    public int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
public class LTCode002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.reverse(input);

        System.out.println("Reversed number: " + result);

        scanner.close();
    }
}