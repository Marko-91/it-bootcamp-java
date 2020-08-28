import java.util.Arrays;
import java.util.Scanner;

/*
    Napisati program koji će za uneti niz proveravati da li rastući ili nije rastući.
    Kao dodatak zadatku, proveriti da li je niz rastući, opadajući ili ništa od toga.
 */
public class Zadatak1 {
    public static int[] arr = new int[0];
    public static int size = 0, min = 0, max = 0, temp = 0;
    public static Scanner scan = new Scanner(System.in);

    public static int size() {
        while (true) {
            System.out.println("Enter a size of array: ");
            size = scan.nextInt();
            if (size > 0) break;
            else {
                System.out.println("Enter a non negative value.");
                continue;
            }
        }

        return size;
    }

    public static int[] init(int size) {
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter an element of your array: ");
            arr[i] = scan.nextInt();
        }

        return arr;
    }

    public static int[] arrAsc(int[] arr) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] arrDesc(int[] arr) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static boolean checkAsc(int[] arr) {
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    public static boolean checkDesc(int[] arr) {
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        arr = init(size());
        if (checkAsc(arr)) System.out.println("Array is in ascending order.");
        if (checkDesc(arr)) System.out.println("Array is in descending order.");
        if (!checkAsc(arr) && !checkDesc(arr)) System.out.println("Array is not in ascending order or descending order.");
    }
}
