/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2luisstanislao;

/**
 *
 * @author Luis Stanislao
 */
public class NodoABB {
    private int dato;
    private NodoABB hijoIzq;
    private NodoABB hijoDer;

    public NodoABB(int dato) {
        this.dato = dato;
        hijoIzq=hijoDer=null;
    }
    
    public int getDato() {return dato;}

    public void setDato(int dato) {this.dato = dato;}

    public NodoABB getHijoIzq() {return hijoIzq;}

    public void setHijoIzq(NodoABB hijoIzq) {this.hijoIzq = hijoIzq;}

    public NodoABB getHijoDer() {return hijoDer;}

    public void setHijoDer(NodoABB hijoDer) {this.hijoDer = hijoDer;}
}
