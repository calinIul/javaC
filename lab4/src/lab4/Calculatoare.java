package lab4;

public class Calculatoare extends Electronice {
    public Calculatoare(String denumire, Integer nr_inv, Float pret, String zona_mag, String stare, String tip_mon, Float vit_proc, Integer c_dd, String sistem) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_dd = c_dd;
        this.sistem = sistem;
    }

    @Override
    public String toString() {
        return "Calculatoare{" +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_dd=" + c_dd +
                ", sistem='" + sistem + '\'' +
                "} " + super.toString();
    }

    enum sist_op {
        WINDOWS,
        LINUX,
    }
    private String tip_mon;
    private Float vit_proc;
    private Integer c_dd;
    private String sistem;

}
