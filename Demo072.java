public class Demo072 {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int result = search(arr, target);
        System.out.println(result == -1 ? "Not Found" : "Found at index " + result);
    }
}

 