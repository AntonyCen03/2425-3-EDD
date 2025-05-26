/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author christian
 */
public class Principal {
    
    
    
    public static void main(String args[])throws InterruptedException{
        Lista milista=new Lista(5);
        milista.inicializar();
        milista.insertar(5);
        milista.insertar(3);
        milista.insertar(9);
        milista.insertar(7);
        milista.insertar(10);
        milista.eliminar(3);
    }
}
