/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        String[] arreglo1 = new String[5];
        // Se asigna valores al arreglo
        arreglo1[0] = "Toshiba";
        arreglo1[1] = "Asus";
        arreglo1[2] = "Dell";
        arreglo1[3] = "HP";
        arreglo1[4] = "Packard Bell";
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %s\n",
                    i, arreglo1[i]);
        }
        
    }

}
