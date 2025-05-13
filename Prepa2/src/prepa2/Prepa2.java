/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prepa2;

/**
 *
 * @author anton
 */
public class Prepa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializar directa de una matriz
        int[][] matriz={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        
        };
        
        //RECORREr matriz e imprimir        
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println(); //salto de linea
        }
                
    }
    
}
