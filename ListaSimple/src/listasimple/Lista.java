/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author anton
 */
public class Lista <T> {
    public Nodo <T> pFisrt;
    public int iN;
    public String name;

    public Lista(String s) {
        this.pFisrt = null;
        this.iN = 0;
        this.name = s;
    }
    
    public int Tamaño(){
        return this.iN;
    }
    
    public boolean EsVacio(){
        return this.pFisrt==null;
        
    }
    
    public Nodo <T> Primero(){
        return this.pFisrt;
    }
    
    public Nodo <T> Ultimo(){
        return null;
    }
    
    public T leer(Nodo<T> pValor){
        return pValor.data;
    }
    
    public Nodo <T> Proximo(Nodo<T> pValor){
        if (pValor!=this.Ultimo()) {
            return pValor.pNext;
        }else{
            return this.Ultimo();
        }
    }
    
    public void Insertar (T x,Nodo<T> pValor){
        Nodo <T> pNew=new Nodo <> (x);
        if (this.EsVacio()) {
            this.pFisrt=pNew;
            
        }else{
            if (pValor!=this.Ultimo()) {
                pNew.pNext=pValor;
                pValor.pNext=pNew;
            }
        }
        this.iN++;
    }
}
