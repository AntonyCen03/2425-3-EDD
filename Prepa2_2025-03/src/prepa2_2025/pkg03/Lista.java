/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2_2025.pkg03;

/**
 *
 * @author anton
 */
public class Lista {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    //Metodo de la clase lista
    
    public boolean Esvacio(){
        return getpFirst() == null;
    }
    
    public void InsertarFinal(Object data){
        Nodo nuevo = new Nodo(data);
        
        if (Esvacio()){
            pFirst=nuevo;
            pLast=nuevo;
            
        }else{
            Nodo aux= pLast;
            aux.setpNext(nuevo);
            pLast=nuevo;
        }
        size++;
    }
    
    public void Imprimir(){
        if (!Esvacio()){
            Nodo aux= pFirst;
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getDato());
                aux= aux.getpNext();
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void EliminarInicio(){
        
        if (!Esvacio()) {
            pFirst=pFirst.getpNext();
            size--;
        }
            
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
