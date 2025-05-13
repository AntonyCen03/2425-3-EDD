/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner; //importar la libreria Scanner

/**
 *
 * @author anton
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //declarar el valor scanner
        
        System.out.println("Por favor ingrese un numero: ");
        int numero= scanner.nextInt(); //pedir un int al usuario
        
        int num=1; //iniciar el num desde 1
        
        for (int i = 1; i <= numero; i++) {
            System.out.println("el numero es: "+num);
            num*=2; //elevarlo al cuadrado desde el 1 hasta el num que ingresa el usuario
        }
        
    }
    
}
