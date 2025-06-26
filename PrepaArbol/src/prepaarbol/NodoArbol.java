/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarbol;

/**
 *
 * @author ANTONY
 */
public class NodoArbol {
       private NodoArbol left;
       private NodoArbol right;
       private String dato;

    public NodoArbol(String dato) {
        this.left = null;
        this.right = null;
        this.dato = dato;
    }

    /**
     * @return the left
     */
    public NodoArbol getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(NodoArbol left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public NodoArbol getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(NodoArbol right) {
        this.right = right;
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

   
       
       
}
