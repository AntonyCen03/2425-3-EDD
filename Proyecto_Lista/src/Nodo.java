/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */
public class Nodo <T> {
    protected T data;
    protected Nodo <T> pNext;
    
    Nodo (T elem){
        this.data=elem;
        this.pNext=null;
    }
   
}
