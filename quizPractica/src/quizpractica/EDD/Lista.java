/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizpractica.EDD;

/**
 *
 * @author valeriazampetti
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

    public Lista(Nodo cabeza, Nodo cola, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = 0;
    }
    
    
    public boolean EsVacia(){
        return getpFirst()== null;
      
    }
    
    public void InsertarAlFinal(Cancion cancion){
        Nodo nuevo = new Nodo(cancion);
        if (this.EsVacia()) {
            setpFirst(pLast=nuevo);
            
        }else{
            Nodo aux= getpLast();
            aux.setpNext(nuevo);
            setpLast(nuevo);
        }
        setSize(getSize()+1);
        
    }
    
    public String BuscarCancion(String nombre){
        Nodo aux= getpFirst();
        
        if (!this.EsVacia()) {
            for (int i = 0; i < getSize(); i++) {
                if (aux.getCancion().getNombre().equalsIgnoreCase(nombre)) {
                    return "La cancion que se encontró es:"+ Integer.toString(aux.getCancion().getNumeroDeCancion())+","+ aux.getCancion().getNombre()+ ","+ aux.getCancion().getArtista()+ ","+ Integer.toString(aux.getCancion().getNumeroReproducciones())+","+Integer.toString(aux.getCancion().getAno())+ aux.getCancion().getIdioma();
                      
                }
                aux= aux.getpNext();
            }
            return "No existe la canción en la lista"; 
            }
              return " No hay en la lista"; 
        }
    
    public Lista FiltrarArtista(String artista){
        Nodo aux= getpFirst();
        Lista listafiltrada= new Lista();
        if (!this.EsVacia()) {
            for (int i = 0; i < getSize(); i++) {
                if (aux.getCancion().getArtista().toLowerCase().equals(artista.toLowerCase())) {
                    listafiltrada.InsertarAlFinal(aux.getCancion());
                    aux= aux.getpNext();
                    
                    
                }else{
                    aux=aux.getpNext();
                }
            }
            
        }
         return listafiltrada;
       
    }
    
    
    public String RetornarCanciones(){
        String cadena="";
        if (!this.EsVacia()) {
            Nodo aux= getpFirst();
            for (int i = 0; i < getSize(); i++) {
                cadena= cadena + aux.getCancion().ImprimirCancion()+ "\n";
                aux= aux.getpNext();
                
            }
            
        }
        return cadena;
        
        
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
