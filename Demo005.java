import java.util.Scanner;
class Demo005 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine(); 
        if (password.equals("Bhanu")) { 
            System.out.println("Hello User, Happy New Year!");
        } else {
            System.out.println("Incorrect Password Please try again");
        }
        sc.close();
    }
}
