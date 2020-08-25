import java.util.Scanner;
// Zadat je nenegativan broj. Sabirati njegove cifre
// sve dok rezultat ne bude samo jedna cifra.
// Ispisati je.
public class Zad2 {
    public static void main(String[] args) {
        int n, rem, sum;
        Scanner scan;

        scan = new Scanner(System.in);
        System.out.println("Enter a number. Keep summing the digits until sum is one digit. :");
        n = scan.nextInt();

        sum = 0;
        while (true) {
            rem = n % 10;
            sum += rem;
            n = n / 10;
            if (n == 0 && sum < 10) break;
            if (rem == 0 && sum > 9) {
                n = sum;
                System.out.println(n);
                sum = 0;
            }
        }

        System.out.println("The sum is " + sum);
    }
}
