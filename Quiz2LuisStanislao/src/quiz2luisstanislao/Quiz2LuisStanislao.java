/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2luisstanislao;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Stanislao
 */
public class Quiz2LuisStanislao {

    
    public static void main(String[] args) {
       Interfaz ventana = new Interfaz();
       ventana.setVisible(true);
       ventana.setTitle("Quiz Luis Stanislao");
       JOptionPane.showMessageDialog(null, "NOTA: Ya se encuentra precargado el arbol del enunciado ");
       /*ArbolBB arbol = new ArbolBB();
       arbol.InsertarRoot(8);
       arbol.Insertar(10,arbol.getRoot());
       arbol.Insertar(3,arbol.getRoot());
       arbol.Insertar(1,arbol.getRoot());
       arbol.Insertar(6,arbol.getRoot());
       arbol.Insertar(14,arbol.getRoot());
       arbol.Insertar(13,arbol.getRoot());
       arbol.Insertar(4,arbol.getRoot());
       arbol.Insertar(7,arbol.getRoot());
       String auxilio =arbol.Preorden(arbol.getRoot(),"");
       System.out.println(auxilio);
       NodoABB primero= new NodoABB(6);
       NodoABB segundo= new NodoABB(3);
       
       NodoABB raiz = arbol.Ancetro2(arbol.getRoot(), primero, segundo);
        System.out.println(raiz.getDato());*/
    }
    
}
