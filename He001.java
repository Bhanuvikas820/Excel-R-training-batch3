import java.util.*;
public class He001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findMex(arr, n);
        sc.close();

    }
    static void findMex(int[] arr, int n){
        Set<Integer> present = new HashSet<>();
        
        int mex = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            present.add(arr[i]);

            while (present.contains(mex)) {
                mex++;
            }

            result.add(mex);
        }

        for (int mexValue : result) {
            System.out.print(mexValue + " ");
        }

    }
}
