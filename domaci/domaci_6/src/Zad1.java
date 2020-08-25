import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Please enter an integer from 0 to infinity: ");
        while(true) {
            n = scan.nextInt();
            if(n >= 0) {
                break;
            }
            System.out.println("Please enter an integer from 0 to infinity: ");
        }
        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println(String.format("%d : 2 = %d; %d : 3 = %d", n, n/2, n, n/3));
        } else {
            System.out.println(String.format("The number %d is not divisible with 2 and 3.", n));
        }

    }
}
