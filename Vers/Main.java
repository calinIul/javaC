package Vers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class Vers {
    private String vers;

    public Vers(String vers) {
        this.vers = vers;
    }

    public int numarCuvinte() {
        String[] cuvinte = vers.split("\\s+");
        return cuvinte.length;
    }

    public int numarVocale() {
        String vocale = "aeiouAEIOU";
        int numarVocale = 0;
        for (char c : vers.toCharArray()) {
            if (vocale.indexOf(c) != -1) {
                numarVocale++;
            }
        }
        return numarVocale;
    }

    public String afisareCuSteluta(String grupare) {
        if (vers.endsWith(grupare)) {
            return "*";
        } else {
            return "";
        }
    }

    public String afisareCuMajuscule() {
        Random random = new Random();
        if (random.nextDouble() < 0.1) {
            return vers.toUpperCase();
        } else {
            return vers;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String grupareAleasa = "xyz";
        Vers[] versuri = new Vers[8];

        try (BufferedReader br = new BufferedReader(new FileReader("src/Vers/cantec_in.txt"))) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
                versuri[index] = new Vers(line.trim());
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("cantec_out.txt")) {
            for (Vers vers : versuri) {
                fw.write(vers.afisareCuMajuscule() + " - Cuvinte: " + vers.numarCuvinte() +
                        ", Vocale: " + vers.numarVocale() + " " + vers.afisareCuSteluta(grupareAleasa) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

