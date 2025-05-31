/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticaparcial1;

/**
 *
 * @author anton
 */
public class Lista {
    public Nodo pFirst;
    public Nodo pLast;
    public int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return pFirst==null;
    }
    
    public void Vaciar(){
        if (!isEmpty()) {
            pFirst=pLast=null;
            size=0;
        }
    }
    
    public void Append(Object data){
        Nodo nuevo= new Nodo(data);
        if (!isEmpty()) {
            this.pLast.setpNext(nuevo);
            pLast=pLast.getpNext();
        }else{
            pFirst=pLast=nuevo;
        }
        size++;
    }
    
    public void DeletepFirst(){
        if (!isEmpty()) {
            pFirst=pFirst.getpNext();
            size--;
        }
    }
    
    public void pop(){
        if (!isEmpty()) {
            
        }else if (pFirst==pLast) {
            this.Vaciar();
        }else{
            Nodo aux=pFirst;
            while (aux.getpNext()!= pLast){
                aux=aux.getpNext();
            }
            aux.setpNext(null);
            pLast=aux;
            size--;
        }
    }
    
    public String Recorrer(){
        Nodo aux;
        String texto="";
        if (!isEmpty()) {
            aux=pFirst;
            while(aux!=null){
                System.out.println(aux.getData());
                texto=texto+aux.getData();
                aux=aux.getpNext();
            }
        }else{
            System.out.println("La lista esta vacias");
            return "La lista esta vacias";
        }
        return texto;
    }
}
