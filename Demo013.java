import java.util.Scanner;

public class Demo013 {

    void AreaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        Demo013 obj = new Demo013();
        obj.AreaOfTriangle();
    }
}