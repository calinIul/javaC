package lab4;

import javax.management.StringValueExp;
import java.util.Arrays;
enum stari {
    ACHIZITIONAT,
    EXPUS,
    VANDUT,
}
public class Electronice {

    private String denumire;
    private Integer nr_inv;
    private Float pret;
    private String zona_mag;
    private stari stare;

    public Electronice(String denumire, Integer nr_inv, Float pret, String zona_mag, String stare) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        if (stare == "achizitionat") {
            this.stare = stari.ACHIZITIONAT;
        }
        else if (stare == "expus") {
            this.stare = stari.EXPUS;

        }
        else {
            this.stare = stari.VANDUT;
        }

    }

    @Override
    public String toString() {
        return "Electronice{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stare=" + stare +
                '}';
    }
}
