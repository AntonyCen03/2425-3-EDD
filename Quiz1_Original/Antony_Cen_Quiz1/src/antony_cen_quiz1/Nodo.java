/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antony_cen_quiz1;

/**
 *
 * @author sl001
 */
public class Nodo <T> {
    public Nodo <T> pNext;
    public T data;

    public Nodo(T elem) {
        this.pNext = null;
        this.data = elem;
    }
    
}
