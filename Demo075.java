import java.util.Scanner;
public class Demo075 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        maxOfArray(arr);
        sc.close();
    }
    static void maxOfArray(int [] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in the given array is: " + max);
    }
}
