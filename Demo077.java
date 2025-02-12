import java.util.Scanner;
public class Demo077 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr1[i] = sc.nextInt();
        }
        copyArrayElements(arr1, arr2);
        sc.close();
    }
    static void copyArrayElements(int [] arr1, int [] arr2){
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
    } 
}
