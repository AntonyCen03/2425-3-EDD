/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author christian
 */
public class Nodo {
    private int info;
    public int sig;
    public int ant;
    
    public Nodo(int dato, int proximo, int anterior){
        this.info=dato;
        this.sig=proximo;
        this.ant=anterior;
    }
    
    public int get(){
        return this.info;
    }
    public void set (int valor){
        this.info=valor;
    }
}
