package pl.imiajd.lakiert;

public class Adres {

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;


    public void Adres_z_nr(String ulica, String numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void Adres_bez_nr(String ulica, String numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz()
    {
        System.out.println(kod_pocztowy + ", " + miasto + "\n" + ulica + ", " + numer_domu + ", " + numer_mieszkania);
    }

}
