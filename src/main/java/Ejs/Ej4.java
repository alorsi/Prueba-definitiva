package Ejs;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cuenta las palabras de una frase

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

       String[] division = frase.split("a");


        System.out.println(division);

    }
}
