import java.util.Scanner;

// Napraviti program koji upisuje broj godina nekih osoba a posle 10 unosa,
// program treba da izbaci koliko osoba ima od 18 do 50 godina a koliko ima mladjih od 18.
public class Zad2 {
    public static void main(String[] args) {
        int age, minors = 0, adults = 0;
        int[] ages;
        Scanner scan;

        scan = new Scanner(System.in);
        ages = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Enter year: ");
            age = scan.nextInt();
            ages[i] = age;
        }

        for(int i = 0; i < ages.length; i++) {
            if (ages[i] < 18) {
                minors++;
            } else {
                adults++;
            }
        }
        System.out.println();
        System.out.println(String.format("The number of adults is %d. The number of minors is %d", minors, adults));
    }
}
