import java.util.Scanner;

public class Demo010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your id: ");
        int id = sc.nextInt();

        int balance = 1000;

        System.out.println("Enter your phone number: ");
        String ph_no = sc.next();

        Customer customer = new Customer(id, balance, ph_no);
        customer.displayDetails();

        sc.close();
    }
}

class Customer extends Demo010 {
    private int id;
    private int balance;
    private String phoneNumber;

    public Customer(int id, int balance, String phoneNumber) {
        this.id = id;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public void displayDetails() {
        System.out.println("User  details: ");
        System.out.println("Your id is " + id);
        System.out.println("Your bank balance is " + balance);
        System.out.println("Your phone number is " + phoneNumber);
    }
}