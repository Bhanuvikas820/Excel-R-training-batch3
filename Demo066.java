import java.util.Scanner;
import java.util.Arrays;
public class Demo066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr1 = new int[s];
        for (int i=0; i<s; i++){
            arr1[i] = sc.nextInt();
        }
        printIndices(arr1);
        sc.close();

        
    }
    static void printIndices(int[] arr1){
        for (int i=0;i<arr1.length; i++){
            System.out.println("Value "+arr1[i]+" is at index "+i);
        }
    }
}