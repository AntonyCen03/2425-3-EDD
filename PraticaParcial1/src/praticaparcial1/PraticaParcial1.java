/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticaparcial1;

/**
 *
 * @author anton
 */
public class PraticaParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista=new Lista();
        
        lista.Append(1);
        lista.Append(2);
        lista.Append(3);
        lista.Append(1);
        lista.Append(2);
        lista.Append(3);
        lista.Append(5);
        
        Lista lista2=new Lista();
        lista2.Append(2);
        lista2.Append(3);
        //lista2.Append(4);
        
        Solucion sol=new Solucion();
        System.out.println(sol.EncuentroSublista2(lista, lista2));
        
        Ventana ventana=new Ventana();
        ventana.setLocationRelativeTo(null);
        ventana.show();
        
}
}
