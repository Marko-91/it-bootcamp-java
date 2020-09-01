import java.util.HashMap;

/*
Kreirati sopstvenu klasu Studenti, koja ce imati sledece podatke:
njihova imena i prezimena, broj indexa, smer, rezultate ispita izrazeni u procentima( 51% za polozen ispit).
U svoj programu koristii klasu i sve navedene parametre gde ce korisnik programa unositi parametre
broj indexa i rezultati ispita.
Unos samo broja indexa ispita treba da izbaci sve podatke o studentu.
 */

public class Student {
    private String ime, prezime, smer, ocena;
    private int brIndexa;

    public Student(String ime, String prezime, String smer, String ocena, int brIndexa) {
        this.ime = ime;
        this.prezime = prezime;
        this.smer = smer;
        this.ocena = ocena;
        this.brIndexa = brIndexa;
    }

    public String getStudent(int brIndexa) {
        if (this.brIndexa == brIndexa) {
            return "Student: " + this.ime +
                    " " + this.prezime +
                    ", Smer: " + this.smer +
                    ", Ocena: " + this.ocena +
                    ", Broj indexa: " + this.brIndexa;
        }
        return "";
    }
}
