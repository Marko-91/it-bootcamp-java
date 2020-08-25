import java.util.Scanner;

/*
A) Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza,
zadržavajući redosled nenultih elemenata.
B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz, već modifikovati postojeći.
 */
public class Zad9 {
    public static void main(String[] args) {
        Scanner scan;
        int size, temp;
        int[] arr;

        scan = new Scanner(System.in);
        System.out.println("This program will move all zeros you enter at the end of an array.");
        System.out.print("Enter the size of your array: ");
        size = scan.nextInt();

        arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter an element of the array: ");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i <= size / 2; i++) {
            if (arr[i] == 0) {
                for (int j = size - 1; j >= size / 2; j--) {
                    if (arr[j] != 0 && i != size - 1) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
