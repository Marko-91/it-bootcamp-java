import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scan;
        int a,b;
        int[] aa, bb, min, max;
        ArrayList <Integer> cc;

        scan = new Scanner(System.in);
        System.out.print("Enter first array length: ");
        a = scan.nextInt();
        System.out.print("Enter second array length: ");
        b = scan.nextInt();

        aa = new int[a];
        for(int i = 0; i < a; i++) {
            System.out.print("Enter first array element: ");
            aa[i] = scan.nextInt();
        }

        bb = new int[b];
        for(int i = 0; i < b; i++) {
            System.out.print("Enter second array element: ");
            bb[i] = scan.nextInt();
        }


        if (a > b) {
            max = aa;
            min = bb;
        } else {
            max = bb;
            min = aa;
        }

        cc = new ArrayList<>();
        for(int i = 0; i < min.length; i++){
            for(int j = 0; j < max.length; j++) {
                if (max[j] == min[i]) {
                    if (!cc.contains(min[i])) cc.add(min[i]);
                    break;
                }
            }
        }
        for(int i = 0; i < cc.size(); i++) {
            if (i == 0) System.out.print("(");
            if (!(i == cc.size() - 1)) {
                System.out.print(cc.get(i) + " * ");
            } else {
                System.out.print(cc.get(i));
            }
            if (i == cc.size() - 1) System.out.println(")");
        }
    }
}
