import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.print("Enter a number: ");
        m = scan.nextInt();
        System.out.println();
        System.out.println("Enter another number: ");
        n = scan.nextInt();
        System.out.println();

        if (m + n <= 10) {
            System.out.println(String.format("%d + %d = %d", m, n, m + n));
        } else {
            System.out.println(String.format("%d * %d = %d", m, n, m * n));
        }
    }
}
