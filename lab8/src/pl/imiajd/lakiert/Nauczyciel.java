package pl.imiajd.lakiert;

public class Nauczyciel extends Osoba{
    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja){
        super(nazwisko,rokUrodzenia);
        this.pensja = pensja;
    }

    public void pokaz() {
        super.pokaz();
        System.out.println("pensja: " + pensja);
    }

    public int getPensja() {
        return pensja;
    }
}
