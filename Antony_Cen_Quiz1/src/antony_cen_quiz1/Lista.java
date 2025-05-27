/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antony_cen_quiz1;

/**
 *
 * @author sl001
 */
public class Lista<T> {
    public Nodo <T> pFirst;
    public int Size;
    public String name;

    public Lista(String s) {
        this.pFirst = null;
        this.Size = 0;
        this.name = s;
    }
    
    public Nodo<T> Primero(){
        return this.pFirst;
    }
    
    public boolean EsVacio(){
        return this.pFirst==null;
    }
    
    public Nodo<T> Ultimo(){
        return null;
    }
    
    public T leer(Nodo<T> pValor){
        return pValor.data;
        
    }
    
    public void Insertar(T x,Nodo<T> pValor){
        Nodo <T> pNew=new Nodo<>(x);
        if(this.EsVacio()){
            this.pFirst = pNew;
            Size ++;
            
        }else{
            if(pValor != this.Ultimo()){
                pNew.pNext = pValor.pNext;
                pValor.pNext = pNew;
                Size++;
            }
            
        }
        
    }
    
    public Nodo<T> Final(){
        if (this.EsVacio()) {
            return null;
            
        }else{
            Nodo<T> pAux=this.Primero();
            while (pAux.pNext!=this.Ultimo()){
                pAux=this.Proximo(pAux);
            }
            return pAux;
        }
    }
    
    public Nodo<T> Proximo(Nodo<T> pValor){
        if (pValor != this.Ultimo()){
            pValor = pValor.pNext;
            return pValor;
        }else{
            return null;
        }
    }
    
    public void VaciarLista(){
        this.Size=0;
        this.pFirst=null;
        this.name="";
    }
    
    public String Recorrer(){
        Nodo<T> pAux;
        String resultado = " ";
        if (this.EsVacio()){
           resultado = "La lista es vacia";
       
       }else{
       pAux=this.Primero();
       while (pAux!= this.Ultimo()){
           resultado = resultado +this.leer(pAux)+",";
           pAux=this.Proximo(pAux);
           
       }
                  
     }
       return resultado;  
        
    }
    
}
