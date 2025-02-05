public class Demo064 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println("Array after swapping first and last elements:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
