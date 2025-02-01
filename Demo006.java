
import java.util.*;

class Demo006{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if((id.equals("Bhanu")) && (pass.equals("Bhanu2005"))){
                System.out.println("Hello Bhanu, You are welcome ");
                break;
            }else{
                System.out.println("credentials does not match. Please try again.");
            }
        }
        sc.close();
    }
}
