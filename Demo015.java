import java.util.Scanner;
public class Demo015 {

    void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + " b = " + b);
        Demo015 obj = new Demo015();
        obj.Swap(a, b);
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}