/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepa2_2025.pkg03;

/**
 * 
 * @author anton
 */
public class Nodo {
    private Nodo pNext;
    private Object dato;
    
    //Get acceder a la informacion
    //Set modificar dentro del nodo

    public Nodo(Object dato) {
        this.pNext = null;
        this.dato = dato;
    }

    /**
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    
    
}
