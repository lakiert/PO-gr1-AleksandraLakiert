package pl.imiajd.lakiert;
import java.time.LocalDate;

public abstract class Instrument {

    String producent;
    java.time.LocalDate rokProdukcji;


    public String getProducent() {
        return producent;
    }

    public java.time.LocalDate getRokProdukcji() {
        return rokProdukcji;
    }


    public abstract void dzwiek();



}
