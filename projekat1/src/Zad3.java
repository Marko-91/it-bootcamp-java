import java.util.Scanner;

//Za zadati ceo broj odrediti da li je on stepen broja 3.
public class Zad3 {
    public static void main(String[] args) {
        Scanner scan;
        int n;

        scan = new Scanner(System.in);
        System.out.print("Enter an integer number to see if it's a power of 3: ");
        n = scan.nextInt();

        while (true) {
            if (n % 3 != 0) {
                System.out.println("The number IS NOT a power of 3.");
                break;
            }
            if (n / 3 == 1) {
                System.out.println("The number IS a power of 3.");
                break;
            }
            n = n / 3;
        }
    }
}
