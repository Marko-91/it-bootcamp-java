import java.util.Scanner;

public class Numter {
    public static void main(String []args) {
        Scanner scan;
        int x;

        scan = new Scanner(System.in);
        System.out.print("Please input a number from 0 to 10: ");
        for(;true;) {
            x = scan.nextInt();
            if(x < 0 || x > 10) {
                System.out.print("Only numbers from 0 to 10 are allowed: ");
                continue;
            }
            break;
        }
        switch(x) {
            case 0:
                System.out.println("You need 4 letters to write zero");
                break;
            case 1:
                System.out.println("You need 3 letters to write one");
                break;
            case 2:
                System.out.println("You need 3 letters to write two");
                break;
            case 3:
                System.out.println("You need 5 letters to write three");
                break;
            case 4:
                System.out.println("You need 4 letters to write four");
                break;
            case 5:
                System.out.println("You need 4 letters to write five");
                break;
            case 6:
                System.out.println("You need 3 letters to write six");
                break;
            case 7:
                System.out.println("You need 5 letters to write seven");
                break;
            case 8:
                System.out.println("You need 5 letters to write eight");
                break;
            case 9:
                System.out.println("You need 4 letters to write nine");
                break;
            case 10:
                System.out.println("You need 3 letters to write ten");
                break;
        }
    }
}
