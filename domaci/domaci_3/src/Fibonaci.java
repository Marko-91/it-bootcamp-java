import java.util.Scanner;

public class Fibonaci {
    public static void fiIterative(int i) {
        int prevOfPrev = 0;
        int prev = 1;
        int next;
        for(int j = 0; j < i; j++) {
            next = prev + prevOfPrev;
            System.out.println(next);
            prevOfPrev = prev;
            prev = next;
        }
    }

    public static void main(String[] args) {
        Scanner scan;
        int fibo;

        scan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        fibo = scan.nextInt();

        fiIterative(fibo);
    }
}
