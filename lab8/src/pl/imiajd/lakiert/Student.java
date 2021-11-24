package pl.imiajd.lakiert;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko,rokUrodzenia);
        this.kierunek = kierunek;
    }

    public void pokaz() {
        super.pokaz();
        System.out.println("kierunek: " + kierunek);
    }

    public String getKierunek() {
        return kierunek;
    }
}
