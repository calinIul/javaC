package lab4;

public class Copiatoare extends Electronice{
    public Copiatoare(String denumire, Integer nr_inv, Float pret, String zona_mag, String stare, int p_ton, String form) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.p_ton = p_ton;
        this.form = form;
    }

    @Override
    public String toString() {
        return "Copiatoare{" +
                "p_ton=" + p_ton +
                ", form='" + form + '\'' +
                "} " + super.toString();
    }

    enum format {
        A3,
        A4
    }
    private int p_ton;
    private String form;
}
