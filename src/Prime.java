import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime?"Prime":"Not Prime");
        scan.close();
    }
}