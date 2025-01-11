import java.util.Scanner;
class Demo025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reverse of the string is: " + Reverse(str));
        sc.close();
        
    }

    public static String Reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
