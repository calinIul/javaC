package ex1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String cale = "src/ex1/judete.txt";
        Scanner sc = new Scanner(new File(cale));
        String[] judete = new String[100];
        int i=0;
        while(sc.hasNextLine()){
            judete[i]=sc.nextLine();
            i++;
        }
        Arrays.sort(judete,0,i-1);
        for(int j=0;j<i;j++){
            System.out.println(judete[j]);
        }
        System.out.println(" ");
        Scanner in = new Scanner(System.in);
        String judet= in.nextLine();
        int poz = Arrays.binarySearch(judete,0,i-1,judet);
        if(poz>=0)
            System.out.println(poz);
        else
            System.out.println("Nu exista");



    }
}