package CNP;

import java.util.Scanner;

class Persoana {
    private String nume;
    private String CNP;

    public String getNume() {
        return this.nume;
    }
    public String getCNP() {
        return this.CNP;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Cate persoane cititi?: ");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();


    }
}
