/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Edd;

/**
 *
 * @author anton
 */
public class Nodo {
    private Nodo pNext;
    private Cancion cancion;

    public Nodo(Cancion cancion) {
        this.pNext = pNext;
        this.cancion = null;
        
        
    }

    public Nodo(Nodo pNext, Cancion cancion) {
        this.pNext = pNext;
        this.cancion = cancion;
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
     * @return the cancion
     */
    public Cancion getCancion() {
        return cancion;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
    
    
    
    
}
