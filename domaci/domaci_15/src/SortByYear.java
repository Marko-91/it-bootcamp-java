import java.util.Comparator;

public class SortByYear implements Comparator<Knjiga> {

    @Override
    public int compare(Knjiga t1, Knjiga t2) {
        return t1.getBrStr() - t2.getBrStr();
    }
}
