import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int ans = 0;
        int pre = 0;
        while (x != 0) {
            pre = ans;
            ans = ans * 10 + x % 10;
            if (ans / 10 != pre) return 0;
            x = x / 10;
        }
        return ans; 
    }
}
public class LTCode002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        Solution sol = new Solution();
        System.out.println("Reverse of " + x + " is " + sol.reverse(x));
        scanner.close();

    }
}