import java.util.Scanner;
// Za zadati niz String-ova ispisati da li niz sadrži iste Stringove dva ili više puta.
public class Zad10 {
    public static void main(String[] args) {
        Scanner scan;
        String str;
        String[] strs;
        int size, count;

        scan = new Scanner(System.in);
        System.out.print("Enter the size of your array of strings: ");
        size = scan.nextInt();

        strs = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter your string: ");
            str = scan.next();
            strs[i] = str;
        }

        count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) continue;
                if (strs[i].equals(strs[j])) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(String.format("In the array, some string element repeats %d times.", count - 1));
    }
}
