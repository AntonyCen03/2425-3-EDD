/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Lista <T> {
    private Nodo <T> pFirst;
    private int iN;
    private String name;

    public Lista (String s){
        this.name=s;
        this.pFirst=null;
        this.iN=0;
    }
    
    public int Tamano(){
        return this.iN;
    }
    
    public boolean EsVacio(){
        return this.pFirst==null;
    }
    
    public Nodo <T> Primero(){
        return this.pFirst;
        
    }
    
    public T Leer(Nodo<T> pValor){
        return pValor.data;
    }
    
    public Nodo<T> Ultimo(){
        return null;
    }
    
    public Nodo<T> Proximo(Nodo<T> pValor){
        if (pValor!=this.Ultimo()) {
            return pValor.pNext;
            
        }else{
            return this.Ultimo();
        }
    }
    public void Insertar (T x, Nodo<T> pValor){
        Nodo <T> pNew=new Nodo <>(x);
        if (this.EsVacio()) {
            this.pFirst=pNew;
             
        }else{
            if (pValor!= this.Ultimo()) {
                pNew.pNext=pValor;
                pValor.pNext=pNew;
                
            }
        }
        this.iN++;
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
    public String Recorrer(){
        Nodo<T> pAux ;
        String resultado="";
        if (this.EsVacio()) {
            return "La lista esta vacia";
        }else{
            pAux=this.Primero();
            while (pAux!=this.Ultimo()){
                resultado=resultado+this.Leer(pAux)+"   ";
                pAux=this.Proximo(pAux);
            }
        }
        return resultado;
    }
    
    public void Eliminar(Nodo<T> pValor) {
        Nodo<T> p=null;
        if (pValor==pFirst) {
            pValor=pFirst;
            pFirst=pValor.pNext;
            
        }else{
            pValor=this.Primero();
            if (p.pNext!=pValor) {
                p=Proximo(p);
                
            }
            p.pNext=pValor.pNext;
        }
        pValor=null;
        iN--;
    }
    
    public Nodo<T> Buscar(T valor) {
    Nodo<T> actual = pFirst;
    while (actual != null) {
        if (actual.data.equals(valor)) {
            return actual;
        }
        actual = actual.pNext;
    }
    return null;
}
    public void empty(){
        this.name="";
        this.pFirst=null;
        this.iN=0;
    }
    
}