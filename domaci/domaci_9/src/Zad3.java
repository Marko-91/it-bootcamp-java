import java.util.Scanner;

public class Zad3 {
    public static void fibonacci(long i) {
        int prevOfPrev = 0;
        int prev = 1;
        int next;
        System.out.println(prev);
        for(int j = 0; j < i - 1; j++) {
            next = prev + prevOfPrev;
            System.out.println(next);
            prevOfPrev = prev;
            prev = next;
        }
    }

    public static void main(String[] args) {
        Scanner scan;
        long n;

        scan = new Scanner(System.in);
        System.out.print("Please enter a number to print Fibonacci numbers: ");
        n = scan.nextLong();

        fibonacci(n);
    }
}