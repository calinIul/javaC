package lab4;

public class Imprimante extends  Electronice{
    private int ppm;
    private String rezolutie;
    private int p_car;
    private String mod_t;

    public Imprimante(String denumire, Integer nr_inv, Float pret, String zona_mag, String stare, int ppm, String rezolutie, int p_car, String mod_t) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_t = mod_t;
    }


    @Override
    public String toString() {
        return "Imprimante{" +
                "ppm=" + ppm +
                ", rezolutie='" + rezolutie + '\'' +
                ", p_car=" + p_car +
                ", mod_t='" + mod_t + '\'' +
                "} " + super.toString();
    }
}
