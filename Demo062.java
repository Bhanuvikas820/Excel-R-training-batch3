import java.util.Arrays;
public class Demo062 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++) {
            if (i == 0 || i == 1 || i == arr.length - 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
