import java.util.Scanner;

public class Zadatak1 {
    public static float shop(int op, float price) {
        float sum;
        sum = 0;

        switch (op) {
            case 0:
                return sum;
            case 1:
                sum += price;
            case 2:
                return sum;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan;
        float price, total;
        int op;

        scan = new Scanner(System.in);
        System.out.println("0 - ends the program; 1 - add price to total sum; 2 - checkout.");

        total = 0;
        while (true) {
            System.out.println("Please enter your op code: ");
            op = scan.nextInt();
            if (op == 0) break;
            System.out.println("Please enter a price: ");
            price = scan.nextFloat();
            total += shop(op, price);
        }

        System.out.println("Your check is " + total);
    }
}
