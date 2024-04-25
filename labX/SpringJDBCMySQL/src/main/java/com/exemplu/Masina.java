package com.exemplu;

public class Masina {
    private int id;
    private String nr_inmatriculare;
    private String marca;
    private int anf;
    private String culoare;
    private int nrkm;
    public Masina() {}

    public Masina(int id, String nr_inmatriculare, String marca, int anf, String culoare, int nrkm) {
        this.id = id;
        this.nr_inmatriculare = nr_inmatriculare;
        this.marca = marca;
        this.anf = anf;
        this.culoare = culoare;
        this.nrkm = nrkm;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNr_inmatriculare() {
        return nr_inmatriculare;
    }

    public void setNr_inmatriculare(String nr_inmatriculare) {
        this.nr_inmatriculare = nr_inmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnf() {
        return anf;
    }

    public void setAnf(int anf) {
        this.anf = anf;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrkm() {
        return nrkm;
    }

    public void setNrkm(int nrkm) {
        this.nrkm = nrkm;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "id=" + id +
                ", nr_inmatriculare='" + nr_inmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", anf=" + anf +
                ", culoare='" + culoare + '\'' +
                ", nrkm=" + nrkm +
                '}';
    }
}
