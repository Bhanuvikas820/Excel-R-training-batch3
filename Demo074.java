import java.util.Scanner;
public class Demo074 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements:");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Demo074 obj = new Demo074();
        obj.sortArray(arr);
        sc.close();

    }
    void sortArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
