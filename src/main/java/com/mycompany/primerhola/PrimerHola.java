
package com.mycompany.primerhola;

/**
 *
 * @author Usuario
 */

//comentario


public class PrimerHola {

    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        
        int numero = 4564636;
        char letra = 'S';
        String frase = "Hola hoy es lunes";
        double decimal = 9.876;
        boolean interruptor = true;
        float numero_grande = 845327567;
        short numero_pequeño = 324;
        String[]vector_palabras;
        int[]vector_numeros;
        float decimal2;
        int numero2;
        
        numero = 92837;
        
        vector_numeros = new int[10];
        for(int i=0; i < 10; i++){
             vector_numeros[i] = i;
        }
        
        for(int i=0; i < 10; i++){
             vector_numeros[i] = (int)(Math.random()*10);
             System.out.println(vector_numeros[i]);
             System.out.println(); //salto de linea
        }
    }
}
