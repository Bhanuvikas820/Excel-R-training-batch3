import java.util.*;
public class Demo020 {
    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("number of terms: ");
            int n = sc.nextInt(); // Number of terms in the Fibonacci series
            printFibonacciSeries(n);
            sc.close();
        
    }
}
