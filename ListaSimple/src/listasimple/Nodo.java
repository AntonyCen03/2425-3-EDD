/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author anton
 */
public class Nodo <T> {
    public T data;
    public Nodo <T> pNext;

    public Nodo(T elem) {
        this.data = elem;
        this.pNext = null;
    }
    
    
}
