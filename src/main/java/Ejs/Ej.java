package Ejs;

import java.util.Scanner;

public class Ej {
    public static void main(String[] args) {

        System.out.println("Introduce el número del ejercicio (11-20)");
        Scanner sc = new Scanner(System.in);
        int ejercicio=sc.nextInt();
//

        switch (ejercicio) {

            case 11:
                System.out.println("Introduce un número para saber si es primo: ");
                int número = sc.nextInt();
                int contador=1;

              for ( contador=1; contador<número    ; contador++ ){
                  if (número%contador != 2){
                      System.out.println("El número "+número+ "no es primo ");}
                      else if (número%contador == 2){
                      System.out.println("El número "+ número+" es primo");


                      
                  }
                  }















            case 12:
            case 13:
            case 19:

            case 15:

            case 16:





            case 14:
                //Dos coches a la misma velocidad, uno parte del km 70 y el otro en el 150
                int km1 = 70;
                int km2 = 150;


                for (int i = 70; i !=km2 ; i++, km2-- ) {

                }
                System.out.println("Los coches se encontrarán en el kilómetro "+km2
                );



                    //if (i == y ){
                        //System.out.println("Los coches se encontrarán en el kilómetro "+y);


























            case 18:
            case 17:
            case 20:



}}}
