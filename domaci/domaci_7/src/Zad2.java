import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Input the number of balls [1,33] : ");
            n = scan.nextInt();
            if(n >= 1 && n <= 33) {
                break;
            }
            System.out.println("The minimum number of balls is 1 max 33.");
        }
        System.out.println(String.format("The number of balls in the basket is %d.", n));
    }
}
