public class Zad4 {
    public static void main(String[] args) {
        double konto=1000;

        for(int i=1; i<=3; i++)
        {
            konto=konto+(konto*0.06);
        }
        System.out.println(konto);
    }
}
