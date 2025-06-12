/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author anton
 */
public class Pila {
    private Nodo pInicio;
    private int Size;

    public Pila() {
        this.pInicio = null;
        this.Size = 0;
    }
    
    public boolean EsVacio(){
        return pInicio == null;
    }
    
    public Object LeerCabezar(){
        return pInicio.getDato();
    }
    
    public int Tamaño(){
        return Size;
    }
    
    public void Apilar(Object dato){
        Nodo nuevo=new Nodo(dato);
        if (EsVacio()) {
            pInicio=nuevo;
        }else{
            Nodo aux=getpInicio();
            nuevo.setpNext(aux);
            pInicio=nuevo;
        }
        Size++;
    }
    
    public void Desapilar(){
        if (!EsVacio()) {
            pInicio=pInicio.getpNext();
            Size--;
        }
    }
    
    public void Imprimir(){
        if (EsVacio()== false) {
            Nodo aux=pInicio;
            for (int i = 0; i < getSize(); i++) {
                System.out.println(aux.getDato()+",");
                aux=aux.getpNext();
            }
            System.out.println("");
        }else{
            System.out.println("La pila esta vacia");
        }
    }
    
    public void EliminarMedio1(Pila stack,int n,int current){ 
        if (stack.EsVacio()|| current==n) {
            return;
        }
        
        Object dato=stack.LeerCabezar();
        stack.Desapilar();
        EliminarMedio1(stack,n,current+1);
        
        
        if (current != n/2 ) {
            stack.Apilar(dato);
        }
        
    }
    
    public void EliminarMedio2(Pila p,int Size){
        int Posicion;
        if (Size%2==0) {
            Posicion=Size/2+1;
        }else{
            Posicion=(Size+1)/2;
        }
        Pop_Posicion(p,1,Posicion);
    }
    
    public void Pop_Posicion(Pila stack,int n,int current){
        int aux;
        if (n!= current) {
            aux=stack.Tamaño();
            stack.Desapilar();
            Pop_Posicion(stack,n+1,current);
            stack.Apilar(aux);
            
        }else{
            stack.Desapilar();
        }
    }
    
    /**
     * @return the pInicio
     */
    public Nodo getpInicio() {
        return pInicio;
    }

    /**
     * @param pInicio the pInicio to set
     */
    public void setpInicio(Nodo pInicio) {
        this.pInicio = pInicio;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }

    
    
    
}
