// Napraviti program u kom su upisani ime i godine nekoliko osoba (minimum 3).
// Kada korisnik programa unosi imena osoba pri svakom unosu treba da izbaci
// njihove godine i poredja od najmladje do najstarije osobe.

import java.util.*;

public class Zad1 {
    public static void main(String[] args) {
        Integer age;
        String name;
        Scanner scan;
        HashMap<Integer, String> users;
        ArrayList<Integer> ages;

        scan = new Scanner(System.in);
        users = new HashMap<>();
        while(true) {
            System.out.println("To exit program enter -1. N.B. Minimum of users is 3.");
            System.out.print("Enter user age: ");
            age = scan.nextInt();
            if (age == -1 && users.size() >= 3) break;
            // else if (age < 0 && users.size() < 3) continue; => handle error...
            System.out.print("Enter user name: ");
            name = scan.next();
            users.put(Integer.valueOf(age), String.valueOf(name));
        }

        ages = new ArrayList<>();
        for(Integer i: users.keySet()) {
            ages.add(i);
        }

        Collections.sort(ages);
        System.out.println();
        for(Integer j: ages) {
            System.out.println(String.format(users.get(j) + " is %d years old.", j));
        }
    }
}
