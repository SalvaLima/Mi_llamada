package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Double a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Inserta el valor de a :");
        a = scn.nextDouble();
        System.out.println("Inserta el valor de b :");
        b = scn.nextDouble();
        System.out.println("Inserta el valor de c :");
        c = scn.nextDouble();

        /**
         * -b (+-) (RAIZ CUADRADA(b^2 - 4 ac)) / 2a
         */


        Double resultado = (Math.pow(b,2)) - (4*a*c);
        System.out.println(resultado);
            double solucion1;
            double solucion2;

            /**
             * una solución
             */

          if (resultado == 0){
              solucion1 = (-b) / (2*a);
              System.out.println("La respuesta es: "+ solucion1);
          }

          else if (resultado != 0){
              solucion1= ((-b) + (Math.sqrt(resultado))) / (2*a);
              solucion2= ((-b) - (Math.sqrt(resultado))) / (2*a);
              System.out.println("Las respuestas son: " + solucion1 + " y: " + solucion2);
          }

          else{
              System.out.println("La operación no se puede realizar");
          }
        }
    }
