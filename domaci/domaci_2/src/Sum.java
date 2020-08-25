import java.util.Scanner;

public class Sum {
    public static void main(String args[]) {
        Scanner scan;
        int x, y, z;

        scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        System.out.println("Please enter the first number");
        x = scan.nextInt();

        System.out.println("Please enter the second number");
        y = scan.nextInt();

        System.out.println("Please enter the third number");
        z = scan.nextInt();

        System.out.println(String.format("The sum of numbers %d, %d and %d is %d.", x, y, z, x+y+z));
    }
}
