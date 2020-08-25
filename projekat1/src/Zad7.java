//Teža varijanta: Zadatak odraditi tako da se ne alocira dodatni prostor,
// već modifikuje ulazni niz.

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scan;
        char tmp;
        char[] arr;

        scan = new Scanner(System.in);
        System.out.print("Enter a string you want to be reversed: ");
        arr = scan.next().toCharArray();

        for(int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
