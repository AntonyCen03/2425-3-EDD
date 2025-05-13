/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepapraticaquiz;

/**
 *
 * @author 58412
 */
public class ListaDoble {
    Nodo pFirst; //Referencias al primer nodo mas a la izquierda
    Nodo pLast; //referencias al ultimo nodo mas a la derecha

    public ListaDoble() {
        this.pFirst = null;
        this.pLast = null;
    }
    
    //Creando una lista vacia
    
    public void append(int dato){
        Nodo nNodo = new Nodo(dato);
        
        if (pFirst == null){
            pFirst= nNodo;
            pLast= nNodo;
        }else{   
            pLast.pNext=nNodo; 
            nNodo.pPrev=pLast; 
            pLast=nNodo; //actualizar la informacion
        }
        
    }
    
    //Metodo para insrtar un nodo al principio de la lista
    public void insertarPrimero(int info){
        Nodo nNodo= new Nodo(info);{
        if (pFirst==null){
            pFirst=nNodo;
            pLast=nNodo;
        }else{
            nNodo.pNext=pFirst;
            pFirst.pPrev=nNodo;
            pFirst=nNodo;
        }
    }
    }
    
    public ListaDoble sumar(ListaDoble lista2){
        Nodo aux1= pLast;
        Nodo aux2= lista2.pLast;
        ListaDoble salida = new ListaDoble();
        
        while(aux1 != null || aux2 != null){
            int suma=0;
            
            if (aux1!= null){
                suma+= aux1.data;
                aux1=aux1.pPrev;
                
            }
            if (aux2 != null){
                suma+= aux2.data;
                aux2=aux2.pPrev;
            }
            salida.insertarPrimero(suma);
        }
        
        Nodo aux3= salida.pLast;
        while(aux3!=null){
            if (aux3.data >= 10){
                aux3.data -= 10;
                if (aux3.pPrev != null){
                    aux3.pPrev.data +=1;
                    
                }else{
                    salida.insertarPrimero(1);
                }
            }
            aux3=aux3.pPrev;
        }
        
         return salida;   
            
    }
    
    //Metodo para representar la lista coomo una 
    
    public String toString(){
        String out="[";
        Nodo aux=pFirst;
        
        while (aux!=null){
            if (aux == pLast){
                out+= ""+pLast.data;
                
            }else{
                out+= ""+ aux.data+ ",";
                
            }
            aux= aux.pNext;
            
        }
        out += "]";
        return out;
    }
 
}
