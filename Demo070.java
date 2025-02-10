public class Demo070 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 11, 15, 17 };

        System.out.println("Prime numbers for the given array:");
        for (int number : arr) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}
