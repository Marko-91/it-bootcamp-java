import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Knjiga> knjige;

        Autor a1 = new Autor("Marko", "Stankovic", 1991);
        Autor a2 = new Autor("Dusan", "Stankovic", 1991);
        Autor a3 = new Autor("Predrag", "Stankovic", 1991);

        knjige = new ArrayList<>();
        Knjiga k1 = new Knjiga("Zanos", a1, 1890, 300);
        knjige.add(k1);
        Knjiga k2 = new Knjiga("Zivot", a2, 1980, 400);
        knjige.add(k2);
        Knjiga k3 = new Knjiga("Matematika", a3, 1089, 500);
        knjige.add(k3);

        Collections.sort(knjige, new SortByYear());
        for (Knjiga k : knjige) {
            System.out.println(k.toString());
        }
    }
}
