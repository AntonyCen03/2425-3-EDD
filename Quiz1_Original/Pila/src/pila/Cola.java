/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author anton
 */
public class Cola {
    private Nodo pInicio;
    private Nodo pFinal;
    private int Size;

    public Cola() {
        this.pInicio = null;
        this.pFinal = null;
        this.Size = 0;
    }
    
    public boolean EsVacio(){
        return pInicio==null;
    }
    
    public Object LeerCabezar(){
        return pInicio.getDato();
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
     * @return the pFinal
     */
    public Nodo getpFinal() {
        return pFinal;
    }

    /**
     * @param pFinal the pFinal to set
     */
    public void setpFinal(Nodo pFinal) {
        this.pFinal = pFinal;
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
