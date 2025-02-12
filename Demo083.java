import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        findVowels(str);
        sc.close();

    }
    static void findVowels(String str){
        char ch = str.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("-----------------------------");
            System.out.println("First character is a vowel");
            System.out.println("-----------------------------");
        }else{
            System.out.println("-----------------------------");
            System.out.println("First character is not a vowel");
            System.out.println("-----------------------------");
        }
    }

}