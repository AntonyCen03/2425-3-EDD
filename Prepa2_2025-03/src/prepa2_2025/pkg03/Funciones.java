/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2_2025.pkg03;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class Funciones {
    private int num1;
    private int num2;

    public Funciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Funciones() {
    }
    
    
    //Metodo de clase
     
    public int pedir_num(){
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingerese un numero: "));
        return numero;
    }
    
    public int sumar(int num1, int num2){
        return num1+num2;
    }
    
    public void mostrar_resultado(Object palabra){
        Component parentComponent;
        JOptionPane.showMessageDialog(parentComponent=null, palabra);
    }
    
}
