package pl.imiajd.lakiert;

public class Osoba{
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void pokaz(){
        System.out.println(nazwisko + ", " + rokUrodzenia);
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
}
