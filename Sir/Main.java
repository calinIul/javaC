package Sir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Sirul initial: ");
        String inputString = scanner.nextLine();


        System.out.print("Sirul inserat: ");
        String insertString = scanner.nextLine();


        System.out.print("Pozitia de inserare: ");
        int insertPosition = scanner.nextInt();


        StringBuilder stringBuilder = new StringBuilder(inputString);


        stringBuilder.insert(insertPosition, insertString);


        System.out.println("Cate caractere doriti sa inserati: " + stringBuilder);


        System.out.print("Pozitia de stergere: ");
        int deleteStartPosition = scanner.nextInt();


        System.out.print("Cate caractere doriti sa stergeti: ");
        int deleteLength = scanner.nextInt();


        stringBuilder.delete(deleteStartPosition, deleteStartPosition + deleteLength);


        System.out.println("String dupa stergere: " + stringBuilder);

        scanner.close();
    }
}
