/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class helpers {
    public static int ValidarNum(String NumString){
        int num;
        try{
            num=Integer.parseInt(NumString);
            return num;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Debe ser un numero !!!");
        }
        return num=0;
    }
}
