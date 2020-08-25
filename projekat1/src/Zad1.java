import java.util.Scanner;

/*
A) Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.
B) Modifikovati program tako da se postupak pod a) ponavlja
i to tako da pre svakog unosa korisnik vidi
pitanje da li želi da unese još jedan broj. Ako je odgovor 'da'
treba izbrojati cifre deljive sa 3, a ukoliko je 'ne'
treba završiti program.
C) Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive.
 */
public class Zad1 {
    public static void main(String[] args) {
        Scanner scan;
        int n, sum, rem;
        String str;

        scan = new Scanner(System.in);
        System.out.print("Please enter a number to see which digits are divisible by the number 3: ");
        n = scan.nextInt();

        sum = 0;
        while(true) {
            rem = n % 10;
            if (rem == 0) {
                System.out.println("Do you want to enter another number?");
                System.out.print("Y/N: ");
                str = scan.next();
                if (str.toLowerCase().equals("y")) {
                    System.out.print("Please input another number: ");
                    n = scan.nextInt();
                    continue;
                } else if(str.toLowerCase().equals("n")) {
                    break;
                } else {
                    System.out.println("Program exited with an error.");
                    System.exit(1);
                }
            }
            if (rem % 3 == 0) {
                System.out.println(rem);
                sum++;
            }
            n = n / 10;
        }

        System.out.println(String.format("The number of digits that are divisible by 3 is %d.", sum));
    }
}
