import java.util.Scanner;

/*
Zadati su jedan niz celih brojeva, i jedan broj koji prestavlja ‘metu’. Napisati program koji vraća indekse dva
broja koja kada se saberu daju rezultat jednak unetoj ‘meti’.
Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje. Ne koristiti jedan element više puta.
 */
public class Zad6 {
    public static void main(String[] args) {
        Scanner scan;
        int size, target, indexj = 0, indexi = 0;
        boolean found;
        int[] arr;

        scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in your array: ");
        size = scan.nextInt();

        arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        System.out.println();
        System.out.print("Enter target: ");
        target = scan.nextInt();
        found = false;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) continue;
                if (target == arr[i] + arr[j]) {
                    found = true;
                    indexj = j;
                    indexi = i;
                    break;
                }
            }
        }
        if (found) System.out.println(String.format("The indexes of elements in the array are %d and %d.", indexj, indexi));
        else System.out.println(String.format("For element %d you entered there is not a solution in the array.", target));


    }
}
