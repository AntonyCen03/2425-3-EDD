/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *Descripcion
 * @author antony
 * @version 29/04/25
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cambiar de String a Int
        String nombre="123";
        int numero= Integer.parseInt(nombre);
        System.out.println(numero);
        
        //Cambiar de Int a String
        int num=999;
        String name= Integer.toString(num);
        System.out.println(name);
        
        //Suma Reducida
        int contador=5; 
        contador+=1;
        System.out.println(contador);
        
        //Resta Reducida
        int contador2=10;
        contador2 -=6;
        System.out.println(contador2);
        
        //Decremento
        int num2=10;
        num2 --;
        System.out.println(num2);
        
    }
    
}
