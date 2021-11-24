import pl.imiajd.lakiert.Punkt;
import pl.imiajd.lakiert.NazwanyPunkt;

public class TestNazwanyPunkt {
    public static void main(String[] arg){
        Punkt p1 = new Punkt(3, 5);

        NazwanyPunkt p2 = new NazwanyPunkt(3, 5, "port");
        p2.show();
    }
}
