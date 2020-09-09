import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class ZaposleniTest {
    @Test
    public void testFields() {
        SoftAssert sa;
        Zaposleni z;
        String naziv;
        int godRodj;
        Date date;

        naziv = "Marko Stankovic";
        godRodj = 1991;
        date = new Date();
        z = new Zaposleni(naziv, godRodj, date);

        // Test for constructor/getters
        sa = new SoftAssert();
        sa.assertEquals(z.getNaziv(), naziv);
        sa.assertEquals(z.getGodRodjenja(), godRodj);
        sa.assertEquals(z.getDatumZap(), date);

        // Test for a setter
        z.setNaziv("Dusan Kovacevic");
        naziv = "Dusan Kovacevic";
        sa.assertEquals(z.getNaziv(), naziv);

        sa.assertAll("Testing finished!");
    }
}
