import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void scriere(List<Carti> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/carti.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Map<Integer, Carti> citire() {
        try {
            File file=new File("src/main/resources/carti.json");
            ObjectMapper mapper=new ObjectMapper();
            Map<Integer, Carti> carti = mapper
                    .readValue(file, new TypeReference<Map<Integer, Carti>>(){});
            return carti;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Map<Integer, Carti> stergere(Map<Integer, Carti> c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ce id doriti sa stergeti?:");
        int key = sc.nextInt();
        c.remove(key);
        return c;
    }
    public static Map<Integer, Carti> adaugare(Map<Integer, Carti> c) {
        Carti carti = new Carti("1984", "G Orwell", 1956);
        int i = 0;
        Set keys = c.keySet();
        while (i <= keys.toArray().length) {
            i++;
        }
        c.putIfAbsent(i, carti);
        return c;
    }


    public static void main(String[] args) {
        Map <Integer, Carti> carti = citire();
        Map <Integer, Carti> carti_noi;
        System.out.println(carti);
        carti.entrySet().forEach(System.out::println);
        //carti = stergere(carti);
        carti.entrySet().forEach(System.out::println);
        carti_noi = adaugare(carti);
        carti_noi.entrySet().forEach(System.out::println);
    }


}

