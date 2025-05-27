/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antony_cen_quiz1;

/**
 *
 * @author sl001
 */
public class Solucion {
    public Lista lista1;
    public Lista lista2;
    public Lista pAux;

    public Solucion(Lista lista1, Lista lista2) {
        this.lista1 = lista1;
        this.lista2 = lista2;
        
    }

    
    public boolean Comparar(Lista L){
        Nodo pAux=this.lista1.pFirst;
        Nodo pAux2=L.pFirst;
        boolean igual=false;
        
        if (lista1.Size!=lista2.Size) {
            return igual;
        }else{
            while(pAux!=null && pAux2!=null){
                if (pAux.data==pAux2.data) {
                    
                }else{
                    igual=false;
                    return igual;
                }
                return !igual;
            }
            return igual;     
        }
   
    }

}
