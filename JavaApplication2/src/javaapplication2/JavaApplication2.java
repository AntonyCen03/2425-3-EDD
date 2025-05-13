/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author anton
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador=1; //inicio el contador
        
        do {
            System.out.println("Intento numero: "+contador);
            contador ++;
        } while (contador <=3);
        
        int suma=0; //guardamos el resultado
        //inicio del for
        for (int i = 1; i <= 10; i++) {
            
            suma+=i;
        }
        System.out.println("Suma total "+suma);
        
        //tpio[] nombre_de_array new tipo[tamaño]
        int[] edades= new int[5];
        
        //asignar valores el array
        
        edades[0]=10;
        edades[1]=15;
        edades[2]=20;
        edades[3]=32;
        edades[4]=26;
        
        //impimir valores el array
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad de la persona"+ (i+1)+": "+edades[i] );
            
        }
        
    }
    
}
