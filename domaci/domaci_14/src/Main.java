import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        String ime, prezime, smer, ocena;
        Student student;
        int brIndexa;
        System.out.println("Unesi informacije o studentima ovim redom: ime, prezime, smer, ocena, br indexa.");
        System.out.println("Da izadjes iz programa ukucaj izlaz");
        scan = new Scanner(System.in);
        while (true) {
            System.out.println("da izadjes iz programa ukucaj izlaz.");
            System.out.print("Unesi ime: ");
            ime = scan.next();
            if (ime.equals("izlaz")) break;
            System.out.println("unesi prezime: ");
            prezime = scan.next();
            System.out.println("Smer: ");
            smer = scan.next();
            System.out.println("Unesi ocenu u procentima: ");
            ocena = scan.next();
            System.out.println("Unesi broj indexa: ");
            brIndexa = scan.nextInt();

            student = new Student(ime, prezime, smer, ocena, brIndexa);
            Studenti.studenti.add(student);
        }

        while (true) {
            System.out.println("Unesi broj indexa: (da izadjes ukucaj 0)");
            brIndexa = scan.nextInt();
            if (brIndexa == 0) break;
            for (Student s : Studenti.studenti) {
                System.out.println(s.getStudent(brIndexa));
            }
        }
    }
}
