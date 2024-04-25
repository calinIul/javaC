package com.exemplu;
public class Persoana {
    private int id;
    private String nume;
    private int varsta;
    public Persoana() {}
    public Persoana(int id, String nume, int varsta) {
        super();
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
    }
    //se genereaza gettere si settere
    @Override
    public String toString() {
        return id + ", " + nume + ", " + varsta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}