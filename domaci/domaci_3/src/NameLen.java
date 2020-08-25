import java.util.Scanner;

public class NameLen {
    public static void main(String []args) {
        Scanner scan;
        String name;

        scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("Hello. Enter a name in the input and the program will tell you how many characters does it have.");
        System.out.println("If you want to exit the program just type \"1\" in the console.");
        for(;true;) {
            System.out.print("Type in your string: ");
            name = scan.nextLine();
            if (name.equals(String.valueOf(1))) {
                break;
            }
            System.out.println("The number of characters in string "+name+" is: "+name.length()+"");
            //System.out.println("To exit type \"1\".");
        }
    }
}
