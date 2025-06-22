
import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to check prime or not:");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println(n + " is not a prime no.");

        } else {
            boolean p = true;

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    p = false;
                    break;
                }
            }
            if (p) {
                System.out.println("prime:");

            } else {
                System.out.println("not prime");
            }
        }
    }

}
