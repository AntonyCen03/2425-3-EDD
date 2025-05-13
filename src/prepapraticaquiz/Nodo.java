/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepapraticaquiz;

/**
 *
 * @author 58412
 */
public class Nodo {
    int data; //
    Nodo pNext; //puntero al siguiente
    Nodo pPrev; //puntero al nodo anterior

    public Nodo(int data) {
        this.data = data;
        this.pNext = null;
        this.pPrev = null;
    }
    
    
}
