/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Edd;

/**
 *
 * @author anton
 */
public class Lista {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Lista(Nodo pFirst, Nodo pLast, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = 0;
    }
    
    private boolean EsVacio(){
        return getpFirst()==null;
    }
    
    //metodo
    public void InsertarAlfinal(Cancion cancion){
        Nodo nuevo=new Nodo(cancion);
        
        if (this.EsVacio()) {
            setpFirst(pLast=nuevo);
            
        }else{
            Nodo aux=getpLast();
            aux.setpNext(nuevo);
            setpLast(nuevo);
        }
        setSize(getSize() + 1);
    }
    
    public String BuscarCancion(String nombre){
        Nodo aux=getpFirst();
        String encontrado="";
        if (!this.EsVacio()) {
            for (int i = 0; i < getSize(); i++) {
                if (aux.getCancion().getNombre().equals(nombre)) {
                    return "La cancion encontrada fue:";
                }
            }
            aux=aux.getpNext();
            
        }
        return "No existe la cancion en la lista";
    }
    
    public Lista FiltrarArtista(String artista){
        Nodo aux= getpFirst();
        Lista ListaFiltrada= new Lista();
        
        if (!this.EsVacio()) {
            for (int i = 0; i < getSize(); i++) {
                if (aux.getCancion().getArtista().equals(artista)) {
                    ListaFiltrada.InsertarAlfinal(aux.getCancion());
                }else{
                    aux=aux.getpNext();
                }
            }
            
        }
        return ListaFiltrada;
    }
    
    public String RetornarCanciones(){
        String cadena="";
        if (!this.EsVacio()) {
            Nodo aux= getpFirst();
            
        }else{
            
        }
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
