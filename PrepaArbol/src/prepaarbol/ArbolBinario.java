/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarbol;

/**
 *
 * @author ANTONY
 */
public class ArbolBinario {
    private NodoArbol root;

    public ArbolBinario() {
        this.root = null;
    }
    
    public boolean isEmpty(){
        return this.root==null;
    }
    
    public void empty(){
        this.root=null;
    }
    
    public NodoArbol BuscarPadre(NodoArbol root, String padre){
        NodoArbol encontrado= null;
        
        if (root.getDato().equals(padre)) {
            return root;
        }
        
        if (root.getLeft()!= null && encontrado==null) {
            encontrado= BuscarPadre(root.getLeft(), padre);
        }
        
        if (root.getRight()!= null && encontrado==null) {
            encontrado= BuscarPadre(root.getRight(), padre);
        }
        
        return encontrado;
    }
    
    public void Insertar(String hijo, String padre, String size){
        NodoArbol nodoHijo= new NodoArbol(hijo);
        
        if (this.isEmpty()) {
            this.root=nodoHijo;
        }else{
            NodoArbol nodoPadre=BuscarPadre(this.root, padre);
            if (nodoPadre==null) {
                System.out.println("El padre no existe");
            }else if (size.equals("left") & nodoPadre.getLeft()==null) {
                nodoPadre.setLeft(nodoHijo);
                
            }else if (size.equals("right") & nodoPadre.getRight()==null) {
                nodoPadre.setRight(nodoHijo);
            }else {
                System.out.println("Ambos Hijos estan lleno");
            }
        }
        
    }
    
    
    public String PreOrden(){
        return PreOrden(this.root, "");
    }
    
    private String PreOrden(NodoArbol root, String route){
        route+= root.getDato()+ ",";
        if (root.getLeft()!= null) {
            route =PreOrden(root.getLeft(),route);
        }
        if (root.getRight() != null) {
            route=PreOrden(root.getRight(),route);
        }
        return route;
    }
    
    public String PosOrden(){
        return PosOrden(this.root, "");
    }
    
    private String PosOrden(NodoArbol root,String route){
        if (root.getLeft()!= null) {
            route =PosOrden(root.getLeft(),route);
        }
        if (root.getRight() != null) {
            route=PosOrden(root.getRight(),route);
        }
        
        route+= root.getDato()+ ",";
        
        return route;
    }
    
    public String InOrden(){
        return InOrden(this.root,"");
    }
    
    private String InOrden(NodoArbol root, String route){
        if (root.getLeft()!=null) {
            route = InOrden(root.getLeft(),route);
        }
        
        route+=root.getDato()+",";
        
        if (root.getRight()!=null) {
            route=InOrden(root.getRight(), route);
        }
        return route;
    }
    
    
    

    /**
     * @return the root
     */
    public NodoArbol getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(NodoArbol root) {
        this.root = root;
    }
    
    
    
}
