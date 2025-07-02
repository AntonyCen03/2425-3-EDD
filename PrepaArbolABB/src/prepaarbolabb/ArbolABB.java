/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepaarbolabb;

/**
 *
 * @author ANTONY
 */
public class ArbolABB {
    private NodoABB Root;

    public ArbolABB() {
        this.Root = null;
    }
    
    public boolean EsVacio(NodoABB node){
        return node==null;
        
    }
    
    public String PreOrden(NodoABB root, String cadena){
        if (root != null) {
            cadena= cadena+root.getDato()+",";
            cadena= PreOrden(root.getHijoI(), cadena);
            cadena= PreOrden(root.getHijoD(), cadena);
            
        }
        return cadena;
    }
    
    public String PosOreden(NodoABB root, String cadena){
        if (root != null) {
            cadena= PosOreden(root.getHijoI(), cadena);
            cadena= PosOreden(root.getHijoD(), cadena);
            cadena= cadena+root.getDato()+",";
        }
        return cadena;
    }
    
    public String InOreden(NodoABB root, String cadena){
        if (root != null) {
            cadena= InOreden(root.getHijoI(), cadena);
            cadena= cadena+root.getDato()+",";
            cadena= InOreden(root.getHijoD(), cadena);
            
        }
        return cadena;
    }
    
    public NodoABB Buscar(int valor,NodoABB root){
        if (this.EsVacio(root)) {
            return null;
        }else{
            if (root.getDato()==valor) {
                return root;
            }else{
                if (valor<root.getDato()) {
                    return Buscar(valor,root.getHijoI());
                }else{
                    return Buscar(valor,root.getHijoD());
                }
            }
        }
        
    }
    
    public NodoABB Insertar(int valor){
        NodoABB nodo=new NodoABB(valor);
        
        if (this.Root==null) {
            this.Root=nodo;
            return nodo;
        }
        
        NodoABB padre=null;
        NodoABB raiz=this.Root;
        
        while(raiz!=null){
            padre=raiz;
            if (nodo.getDato() < raiz.getDato()) {
                raiz=raiz.getHijoI();
            }else{
                raiz=raiz.getHijoD();
            }
            nodo.setPadre(padre);
        }
        
        if (padre==null) {
            this.Root=nodo;
        }else if (nodo.getDato() < padre.getDato()) {
            padre.setHijoI(nodo);
        }else{
            padre.setHijoD(nodo);
        }
        
        if (nodo.getPadre()==null) {
            return this.Root;
        }
        return this.Root;
    }
    
    
    
    

    /**
     * @return the Root
     */
    public NodoABB getRoot() {
        return Root;
    }

    /**
     * @param Root the Root to set
     */
    public void setRoot(NodoABB Root) {
        this.Root = Root;
    }
    
    
    
}
