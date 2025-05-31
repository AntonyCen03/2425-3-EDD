package praticaparcial1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Nodo {
    private Object data;
    private Nodo pNext;

    public Nodo(Object data) {
        this.data = data;
        this.pNext = null;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
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
