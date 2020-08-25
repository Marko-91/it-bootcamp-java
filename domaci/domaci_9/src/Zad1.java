import java.time.LocalDate;
import java.util.Scanner;

// Napisati program koji od korisnika traži da unese neki datum i
// da ispiše koji je to po redu dan u godini.
public class Zad1 {
    public static void main(String[] args) {
        Scanner scan;
        LocalDate date;
        int year, month, day;

        scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter year: ");
            year = scan.nextInt();
            if (year >= 0) break;
            System.out.println("Year should not be a negative number.");
        }

        while (true) {
            System.out.print("Enter month: ");
            month = scan.nextInt();
            if (month > 0 && month < 13) break;
            System.out.println("The months should be a number from 1 to 12.");
        }

        while (true) {
            System.out.print("Enter day: ");
            day = scan.nextInt();
            if (day > 0 && day < 32) break;
            System.out.println("The day should be a number between 1 and 31.");
        }


        date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfYear());
    }
}
