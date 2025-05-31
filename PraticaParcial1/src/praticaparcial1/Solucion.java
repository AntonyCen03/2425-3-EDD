/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praticaparcial1;

/**
 *
 * @author anton
 */
public class Solucion {

    public Solucion() {
    }
    
    public int EncuentroSublista2(Lista L1,Lista L2){
        if (L1.isEmpty() || L2.isEmpty()) {
            return 0;
        }else if (L2.size > L1.size) {
            return 0;
        }else{
            Nodo aux1=L1.pFirst;
            Nodo aux2;
            int contador=0;
            while (aux1 !=null){
                Nodo inicio=aux1;
                aux2=L2.pFirst;
                while(aux1 != null && aux2 != null && aux1.getData() == aux2.getData()){
                    aux1=aux1.getpNext();
                    aux2=aux2.getpNext();
                }
                if (aux2==null) {
                    contador++;
                }
                aux1=inicio.getpNext();
            }
            return contador;
        }
    }
    
    public int EncuentroSublista1(Lista l1,Lista l2){
        if (l1.isEmpty()) {
            return 0;
        }else if (l2.isEmpty()) {
            return 0;
        }else if (l2.size > l1.size) {
            return 0;
        }else{
            Nodo aux1=l1.pFirst;
            Nodo aux2=l2.pFirst;
            int contador=0;
            while(aux1!=null){
                Nodo inicio=aux1;
                while (aux2!=null){
                    if (aux2.getData()== aux1.getData()) {
                        if (aux2.getpNext()==null) {
                            contador++;
                            break;
                        }
                        aux2=aux2.getpNext();
                        aux1=aux1.getpNext();
                    }else if (aux2 == l2.pFirst) {
                        break;
                    }else{
                        aux2=l2.pFirst;
                    }
                }
                aux2=l2.pFirst;
                aux1=inicio.getpNext();
            }
            return contador;
        }
    }
    
}
