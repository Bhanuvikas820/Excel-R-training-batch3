import java.util.*;

public class Demo065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements in arrar: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        } 
        printArray(arr);       
    }

    static void printArray(int[] arr){
        for(int j=0; j<arr.length; j++){
            System.out.println(+arr[j]);
        }

    }
}
