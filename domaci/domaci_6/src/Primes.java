import java.util.HashMap;
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int n, i, j;
        HashMap<Integer, String> hm = new HashMap<>();
        Scanner scan;

        scan = new Scanner(System.in);
        System.out.print("Enter a number which will represent your n | [2,n]: ");
        while (true) {
            n = scan.nextInt();
            if (n > 2) {
                break;
            }
            System.out.println("Please enter a number that is greater than 2: ");
        }

        for (i = 2; i < n; i++) { // populate, initial all are primes
            hm.put(i, "isPrime");
        }

        for (int key : hm.keySet()) { // Logic
            for (j = key + 1; j < hm.size() + 2; j++) {
                if(hm.get(j).equals("isNotPrime")) {
                    continue;
                }
                if (j % key == 0) {
                    hm.put(j, "isNotPrime");
                }
            }
        }

        for (int k : hm.keySet()) { // print out
            if(hm.get(k).equals("isPrime")) {
                System.out.print(k + ", ");
            }
        }
    }
}
