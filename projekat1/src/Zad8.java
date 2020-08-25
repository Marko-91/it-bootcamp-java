import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
A) Napisati program koji za uneti broj telefona (u vidu String-a) ispisuje informaciju o tome da
 li je broj
napisan u odgovarajućem formatu. Pretpostaviti da se validan telefonski broj može pojaviti u jednom od
sledećih formata:
(xxx) xxx-xxxx ili xxx-xxx-xxxx gde 'x' predstavlja jednu cifru.
// \(\d{3}+\)\p{Space}\d{3}+-\d{4}+
// \d{3}-\d{3}-d{4}
// (\(\d{3}+\)\p{Space}\d{3}+-\d{4}+)|(\d{3}+-\d{3}+-\d{4}+)

B) Modifikovati program tako da on učitava brojeve telefona sve dok korisnik ne unese reč 'stop'.
 */
public class Zad8 {
    public static void main(String[] args) {
        Scanner scan;
        String num;
        Pattern p;
        Matcher m;
        boolean test;

        scan = new Scanner(System.in);

        p = Pattern.compile("(\\(\\d{3}+\\)\\p{Space}\\d{3}+-\\d{4}+)|(\\d{3}+-\\d{3}+-\\d{4}+)");
        while (true) {
            System.out.println("Enter your phone number: ");
            num = scan.nextLine();
            m = p.matcher(num);
            test = m.matches();
            if (num.toLowerCase().equals("stop")) break;
            if (test) System.out.println(num + " is VALID number format. Enter stop to exit program.");
            else System.out.println(num + " is INVALID number format. Enter stop to exit program");
        }
    }
}
