import java.util.Scanner;

// Napisati program koji traži od korisnika da unese
// deset celih brojeva (brojevi trebaju da se učitavaju kao niz),
// zatim sortira brojeve od najmanjeg do najveceg i tako sortirane ih istampa.
public class Zad2 {
    public static void main(String[] args) {
        Scanner scan;
        int x, count, swap, temp;
        int[] arr;

        scan = new Scanner(System.in);
        System.out.print("Enter the number of elements for your array: "); // size of array
        count = scan.nextInt();

        arr = new int[count];
        for(int i = 0; i < count; i++) { // populate array
            System.out.print("Enter a number: ");
            x = scan.nextInt();
            arr[i] = x;
        }

        swap = -1; // Set the swap to a non zero value
        while(swap != 0) {
            swap = 0; // Reset the swap to 0
            for(int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { //change the order if bigger
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++; // increment swap, if swap=0, then array is sorted => bubble sort
                }
            }
        }

        for(int i = 0; i < count; i++) { // print out array
            System.out.print(arr[i] + " ");
        }
    }
}
