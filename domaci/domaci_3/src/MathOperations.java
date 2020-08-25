import java.util.Scanner;

public class MathOperations {
    public static String oneLimit(int result) {
        if (result > 1) {
            return "is bigger than 1.";
        } else if (result == 1) {
            return "is equal to 1.";
        } else {
            return "is smaller than 1.";
        }
    }
    public static void main(String [] args) {
        Scanner scan;
        int a, b;

        scan = new Scanner(System.in);

        System.out.println("Enter two numbers in the input of this program.");
        System.out.print("Enter the first number: ");
        a = scan.nextInt();

        System.out.print("Enter the second number: ");
        b = scan.nextInt();

        System.out.println("");
        System.out.println(String.format("The result of %d + %d, namely %d %s",a,b,a+b,oneLimit(a+b)));
        System.out.println(String.format("The result of %d - %d, namely %d %s",a,b,a-b,oneLimit(a-b)));
        System.out.println(String.format("The result of %d * %d, namely %d %s",a,b,a*b,oneLimit(a*b)));
        System.out.println(String.format("The result of %d / %d, namely %d %s",a,b,a/b,oneLimit(a/b)));
    }
}
