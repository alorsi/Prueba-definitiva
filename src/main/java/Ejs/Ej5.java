package Ejs;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre y tus apellidos");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        String[] palabras = nombre.split(" ");
        System.out.println(nombre.length());


    }
}
