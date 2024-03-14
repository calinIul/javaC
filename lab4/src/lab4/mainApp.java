package lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Electronice> list = new ArrayList<Electronice>();
        read(list);
        write(list);
    }
    private static void read(List<Electronice> list) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/echipamente.txt"));
            String line;
            while ((line = reader.readLine()) != null ){
                String[] data = line.split(";");
                String tip = data[5];
                if (tip == "imprimanta") {

                    Imprimante imp = new Imprimante(data[0], Integer.parseInt(data[1]), Float.parseFloat(data[2]), data[3], data[4], Integer.parseInt(data[6]), data[7], Integer.parseInt(data[8]), data[9]);
                    list.add(imp);
                }
                else if (tip == "copiator")
                {

                    Copiatoare copi = new Copiatoare(data[0], Integer.parseInt(data[1]), Float.parseFloat(data[2]), data[3], data[4], Integer.parseInt(data[6]), data[7]);
                    list.add(copi);
                }
                else {

                     Calculatoare calc = new Calculatoare(data[0], Integer.parseInt(data[1]), Float.parseFloat(data[2]), data[3], data[4], data[6], Float.parseFloat(data[7]), Integer.parseInt(data[8]), data[9]);
                     list.add(calc);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void write(List<Electronice> list) {
        for (Electronice e : list) {
            System.out.println(e);

        }
        
    }

}
