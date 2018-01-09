/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Collatz {
    //ARRANQUE DE UNA CLASE
    //psvm + TAB
    public static void main(String[] args) {
        //utilizar control de excepciones
        try
        {
            
        }catch(Exception ex){
            System.out.println("Error: " +ex);
            
        }
        
        //Y CONTROL DE RANGO DE VARIABLES
        //Todas las clase de numeros contienen constantes
        //para averiguar el posible valor de las variables
        //Integer.MAX_VALUE
        //Integer.MIN_VALUE
        
        //MENSAJES POR PANTALLA
        // sout + TAB
        System.out.println("Introduzca un numero");
        //REALIZAR IMPORT DESDE NUESTRO CODIGO JAVA
        //1.- USAR LA BOMBILLA
        //2.- MIENTRAS ESCRIBIMOS, CTRL + SPACE
        Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        //CONVERTIMOS EL DATO A NUMERO
        int numero = Integer.parseInt(dato);    
            /*
             Conjetura Collatz
             Todo numero positivo siempre sera 1.
            Con estos pasos:
            - Si es par: divide entre 2
            - Si es impar: Multiplicar por 3 + 1
            ejemplo: 6, 3, 10, 5, 16, 8, 4, 2, 1
            */

            //EJECUTAR CUALQUIER APP JAVA: MAYUS + F6
            while (numero != 1) {
                //EJECUTAR DEPURANDO
                //CONTROL + MAYUS + F5


                if (numero % 2 == 0) {
                    numero = numero / 2;
                } else {
                    numero = numero * 3 + 1;

                }
                System.out.println("Numero: " + numero);
            }
    }
    
}
