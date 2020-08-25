import java.util.Scanner;

public class LunaPark {
    public static void main(String []args) {
        Scanner scan;
        final int COINA = 1, COINB = 2, COINC = 3;
        // first coin = all rides, second coin = every other ride, 3rd coin = every fourth ride
        int x, lotto; // number of rides = x
        scan = new Scanner(System.in);

        System.out.println("You are building a luna park. How many rides will it have?");
        System.out.print("Input the number of rides: ");
        x = scan.nextInt();
        System.out.println("Now choose the magic number between 1 and 3 (including): ");
        for(;true;) {
            lotto = scan.nextInt();
            if(lotto == 1 || lotto == 2 || lotto == 3) {
                break;
            }
            System.out.print("Please choose only numbers between 1 and 3 inclusive: ");
        }


        switch(lotto) {
            case COINA:
                System.out.println(String.format("Yay! You need %d coins to ride on all rides three times!", COINA*x*3));
                break;
            case COINB:
                System.out.println(String.format("Alright. You need %d coins to ride on all rides three times", COINB*x*3));
                break;
            case COINC:
                System.out.println(String.format("Bummer. You need %d coins to ride on all rides three times", 4*x*3));
                break;
        }
    }
}
