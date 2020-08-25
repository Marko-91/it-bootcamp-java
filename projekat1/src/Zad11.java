import java.util.Scanner;

// Za zadat niz koji sadrži n različitih brojeva uzetih iz skupa 0, 1, 2, ...,
// n pronaći jedan koji u tom nizu nedostaje.
// pretpostavi da uneses jedan element koji nedostaje a moze i vise, ali pazi da unosi budu jedinstveni
public class Zad11 {
    public static void main(String[] args) {
        Scanner scan;
        int x, count, swap, temp;
        int[] arr;

        scan = new Scanner(System.in);
        System.out.print("Enter the number of elements for your array: "); // size of array
        count = scan.nextInt();

        arr = new int[count];
        for (int i = 0; i < count; i++) { // populate array
            System.out.print("Enter a number: ");
            x = scan.nextInt();
            arr[i] = x;
        }

        swap = -1; // Set the swap to a non zero value
        while (swap != 0) {
            swap = 0; // Reset the swap to 0
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { //change the order if bigger
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++; // increment swap, if swap=0, then array is sorted => bubble sort
                }
            }
        }

        for (int i = 0; i < count - 1; i++) { // the missing number!
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println("The missing number is: " + arr[i] + 1);
            }
        }
    }
}