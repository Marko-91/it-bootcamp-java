import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("Enter four numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();


        System.out.println(String.format("%d * %d = %d is an even number | %b.",a,b,a*b,a*b%2==0));
        System.out.println(String.format("%d + %d = %d is an even number | %b.",c,d,a+b,a+b%2==0));

    }
}
