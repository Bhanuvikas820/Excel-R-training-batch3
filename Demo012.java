import java.util.Scanner;

public class Demo012 {

    void AreaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }

    public static void main(String[] args) {
        Demo012 obj = new Demo012();
        obj.AreaOfCircle();
    }
}
