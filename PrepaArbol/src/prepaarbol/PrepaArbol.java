/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepaarbol;

/**
 *
 * @author ANTONY
 */
public class PrepaArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario BT= new ArbolBinario();
        
        BT.Insertar("5", null, null);
        BT.Insertar("2", "5", "left");
        BT.Insertar("9", "5", "right");
        BT.Insertar("1", "2", "left");
        BT.Insertar("3", "2", "right");
        BT.Insertar("4", "3", "right");
        BT.Insertar("7", "9", "left");
        BT.Insertar("11", "9", "right");
        BT.Insertar("6", "7", "left");
        BT.Insertar("8", "7", "right");
        BT.Insertar("10", "11", "left");
        BT.Insertar("12", "11", "right");
        
        System.out.println("PreOrden: ");
        System.out.println(BT.PreOrden());
        System.out.println("PosOrden: ");
        System.out.println(BT.PosOrden());
        System.out.println("InOrden: ");
        System.out.println(BT.InOrden());
        
        
    }
    
    
}
