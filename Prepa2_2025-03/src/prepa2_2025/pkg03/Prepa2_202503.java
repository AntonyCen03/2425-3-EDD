/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa2_2025.pkg03;

/**
 *
 * @author anton
 */
public class Prepa2_202503 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
      Lista mylist= new Lista();
      
      mylist.InsertarFinal(1);
      mylist.InsertarFinal(2);
      mylist.InsertarFinal(3);
      mylist.InsertarFinal(4);
      
      mylist.Imprimir();
      
      mylist.EliminarInicio();
       System.out.println(" ");
      mylist.Imprimir();
           
    }    
}
