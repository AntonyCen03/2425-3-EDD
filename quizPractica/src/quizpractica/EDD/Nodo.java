/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizpractica.EDD;

/**
 *
 * @author valeriazampetti
 */
public class Nodo {
    private Cancion cancion;
    private Nodo pNext;

    public Nodo(Cancion cancion) {
        this.cancion = cancion;
        this.pNext = null;
    }

    public Nodo(Cancion cancion, Nodo nodo) {
        this.cancion = cancion;
        this.pNext = nodo;
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
    
    
    
    
}
