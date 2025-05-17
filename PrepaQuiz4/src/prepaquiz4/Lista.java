/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaquiz4;

/**
 *
 * @author anton
 */
public class Lista {
    Nodo pFirst;
    int iN;

    public Lista() {
        this.pFirst = pFirst;
        this.iN = 0;
    }
    
    public boolean isEmpty(){
        return pFirst == null;
        
    }
    
    public void Empty(){
        this.pFirst= null;
        this.iN=0;
        
    }
    
    public void Begin(int data){
       Nodo pNew= new Nodo(data);
        
        if (isEmpty()){
            this.pFirst=pNew;
            
        }else{
            pNew.pNext=this.pFirst;
            this.pFirst=pNew;
            
        }
        this.iN++;
        
    }
    
    public String recorrer(){
        Nodo aux = this.pFirst;
        String cadena= "";
        
        for (int i = 0; i < this.iN; i++) {
            cadena= cadena+" "+ Integer.toString(aux.data);
            aux= aux.pNext;
            
        }
        return cadena;
    }
    public boolean comparar(Lista l){
        Nodo aux= this.pFirst;
        Nodo aux2= l.pFirst;
        boolean igual=false;
        
        if (this.iN != l.iN) {
            return igual;
            
        }else {
            while (aux != null && aux2 != null){
                if (aux.data == aux2.data) {
                    
 
                }else{
                    igual=false;
                    return igual;
                }
                return !igual;
            }
        }
        return igual;
    }
}
