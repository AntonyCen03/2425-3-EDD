/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarbolabb;

/**
 *
 * @author ANTONY
 */
public class NodoABB {
    private int dato;
    private NodoABB hijoI;
    private NodoABB hijoD;
    private NodoABB padre;

    public NodoABB(int dato) {
        this.dato = dato;
        this.hijoI = null;
        this.hijoD = null;
        this.padre = null;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the hijoI
     */
    public NodoABB getHijoI() {
        return hijoI;
    }

    /**
     * @param hijoI the hijoI to set
     */
    public void setHijoI(NodoABB hijoI) {
        this.hijoI = hijoI;
    }

    /**
     * @return the hijoD
     */
    public NodoABB getHijoD() {
        return hijoD;
    }

    /**
     * @param hijoD the hijoD to set
     */
    public void setHijoD(NodoABB hijoD) {
        this.hijoD = hijoD;
    }

    /**
     * @return the padre
     */
    public NodoABB getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(NodoABB padre) {
        this.padre = padre;
    }
    
    

}
