import java.util.Scanner;
public class PS002 {
    public void NextMultipleOf100(int n) {
        int nextMultipleOf100 = 0;
        if (n % 100 == 0) {
            nextMultipleOf100 = n;
        } else if(n < 0) {
            nextMultipleOf100 = -1;
        }else {
            nextMultipleOf100 = ((n / 100) + 1) * 100;
        }
        System.out.println("Next multiple of 100 is: " + nextMultipleOf100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        PS002 obj = new PS002();
        obj.NextMultipleOf100(n);
        sc.close();
    }
}