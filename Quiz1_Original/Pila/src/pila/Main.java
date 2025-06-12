/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

/**
 *
 * @author anton
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila mystack=new Pila();
        
       mystack.Apilar(1);
       mystack.Apilar(2);
       mystack.Apilar(3);
       mystack.Apilar(4);
       //mystack.Apilar(5);
       //mystack.Apilar(6);
       mystack.Imprimir();
       
       mystack.EliminarMedio2(mystack, mystack.Tamaño());
       
       mystack.Imprimir();
    }
    
}
