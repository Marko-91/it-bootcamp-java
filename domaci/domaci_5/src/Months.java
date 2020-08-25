import java.util.Scanner;

public class Months {
    public static int countDays(String d) {
        switch (d.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "september":
            case "december":
                return 31;
            case "february":
            case "april":
            case "june":
            case "october":
            case "november":
                return 30;
            default:
                return 0;
        }
    }
    public static void main(String []args) {
        Scanner scan;
        int sum = 0, i;
        String month;

        scan = new Scanner(System.in);

        for(i = 0;i < 3;i++) {
            System.out.print("Please enter name of a month: ");
            month = scan.nextLine();
            sum += countDays(month);
        }

        System.out.println("The sum of number of days of the months is: " + sum);
    }
}
