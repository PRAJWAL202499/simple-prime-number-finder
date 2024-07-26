
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            boolean isPrime = true;
            for (int a = 2; a <= n - 1; a++) {   // to check wheather n is multiple of itself or not
                if (n % a == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Given number " + n + " is prime");
            } else {
                System.out.println("Given number " + n + " is not prime");
            }
            System.out.println();
        }
    }
}
