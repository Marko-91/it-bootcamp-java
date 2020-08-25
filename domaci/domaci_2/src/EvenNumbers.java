import java.io.File;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String []args) {
        Scanner scan = null;
        int number;
        String filename;

        if (args.length != 1) {
            System.exit(1);
        }

        filename = args[0];
        try {
            scan = new Scanner(new File(filename));
        }
        catch (Exception e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        while(scan.hasNextInt()) {
            number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("Number "+number+" is even.");
            }
        }
    }
}
