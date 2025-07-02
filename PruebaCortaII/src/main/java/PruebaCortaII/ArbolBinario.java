/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaCortaII;

/**
 *
 * @author AlbertoJosé
 */
public class ArbolBinario <T> {
    private NodoBinario <T> pRoot;

    public ArbolBinario() {
        this.pRoot = null;
    }
    
    public ArbolBinario(NodoBinario <T> pRoot) {
        this.pRoot = pRoot;
    }
    
    public NodoBinario <T> raiz() {
        return pRoot;
    }
    
    public int tamanio(NodoBinario <T> root) {
        int counter = 0;
        if (root != null) {
            counter++;
            counter += tamanio(root.left);
            counter += tamanio(root.right);
        }
        return counter;
    }
    
    public int altura(NodoBinario <T> root) {
        if (root == null) {
            return 0;
        }
        else {
            return Math.max(altura(root.left),altura(root.right)) + 1;
        }
    }
    
    public boolean esVacio() {
        return (pRoot == null);
    }
    
    public NodoBinario<T> izquierdo(NodoBinario <T> idNodo) {
        return idNodo.left;
    }
    
    public NodoBinario<T> derecho(NodoBinario <T> idNodo) {
        return idNodo.right;
    }
    
    public boolean existeIzq(NodoBinario <T> idNodo) {
        return (idNodo.left != null);
    }
    
    public boolean existeDer(NodoBinario <T> idNodo) {
        return (idNodo.right != null);
    }
    
    public T leer(NodoBinario <T> idNodo) {
        return idNodo.info;
    }
    
    public NodoBinario<T> padreABB(NodoBinario <T> idNodo, NodoBinario <T> root) {
        NodoBinario <T> padre;
        try {
            if (root != null) {
                if (root.left == idNodo || root.right == idNodo) {
                    padre = root;
                }
                else if (Double.parseDouble(String.valueOf(root.info)) > 
                        Double.parseDouble(String.valueOf(idNodo.info))) {
                    padre = padreABB(idNodo, root.left);
                }
                else {
                    padre = padreABB(idNodo, root.right);
                }
            }
            else {
                padre = null;
            }
        }
        catch (Exception e) {
            if (root != null) {
                if (root.left == idNodo || root.right == idNodo) {
                    padre = root;
                }
                else if (String.valueOf(root.info).compareTo(String.valueOf(idNodo.info)) > 0) {
                    padre = padreABB(idNodo, root.left);
                }
                else {
                    padre = padreABB(idNodo, root.right);
                }
            }
            else {
                padre = null;
            }
        }
        return padre;
    }
    
    public boolean esHoja(NodoBinario <T> idNodo) {
        return (idNodo.left == null && idNodo.right == null);
    }
    
    public NodoBinario<T> buscarABB(T clave, NodoBinario <T> root) {
        NodoBinario <T> objetivo;
        try {
            if (root != null) {
                if (root.info == clave) {
                    objetivo = root;
                }
                else if (Double.parseDouble(String.valueOf(root.info)) > 
                        Double.parseDouble(String.valueOf(clave))) {
                    objetivo = buscarABB(clave, root.left);
                }
                else {
                    objetivo = buscarABB(clave, root.right);
                }
            }
            else {
                objetivo = null;
            }
        }
        catch (Exception e) {
            if (root != null) {
                if (root.info == clave) {
                    objetivo = root;
                }
                else if (String.valueOf(root.info).compareTo(String.valueOf(clave)) > 0) {
                    objetivo = buscarABB(clave, root.left);
                }
                else {
                    objetivo = buscarABB(clave, root.right);
                }
            }
            else {
                objetivo = null;
            }
        }
        return objetivo;
    }
    
    public void insertar(T clave, NodoBinario <T> root) {
        try {
            if (esVacio()) {
                pRoot = new NodoBinario(clave);
            }
            else if (Double.parseDouble(String.valueOf(root.info)) >
                    Double.parseDouble(String.valueOf(clave))) {
                if (root.left == null) {
                    root.left = new NodoBinario(clave);
                }
                else {
                    insertar(clave, root.left);
                }
            }
            else if (Double.parseDouble(String.valueOf(root.info)) <
                    Double.parseDouble(String.valueOf(clave))) {
                if (root.right == null) {
                    root.right = new NodoBinario(clave);
                }
                else {
                    insertar(clave, root.right);
                }
            }
        }
        catch (Exception e) {
            if (esVacio()) {
                pRoot = new NodoBinario(clave);
            }
            else if (String.valueOf(root.info).compareTo(String.valueOf(clave)) > 0) {
                if (root.left == null) {
                    root.left = new NodoBinario(clave);
                }
                else {
                    insertar(clave, root.left);
                }
            }
            else if (String.valueOf(root.info).compareTo(String.valueOf(clave)) < 0) {
                if (root.right == null) {
                    root.right = new NodoBinario(clave);
                }
                else {
                    insertar(clave, root.right);
                }
            }
        }
    }
    
    public String preorden(NodoBinario <T> root) {
        String recorrido = "";
        if (root != null) {
            recorrido += "(" + root.info + ") ";
            recorrido += preorden(root.left);
            recorrido += preorden(root.right);
        }
        return recorrido;
    }
    
    public String inorden(NodoBinario <T> root) {
        String recorrido = "";
        if (root != null) {
            recorrido += inorden(root.left);
            recorrido += "(" + root.info + ") ";
            recorrido += inorden(root.right);
        }
        return recorrido;
    }
    
    public String postorden(NodoBinario <T> root) {
        String recorrido = "";
        if (root != null) {
            recorrido += postorden(root.left);
            recorrido += postorden(root.right);
            recorrido += "(" + root.info + ") ";
        }
        return recorrido;
    }
    
    public String imprimir(NodoBinario <T> root, int nivel, String conector) {
        String recorrido = "";
        if (root != null){
            recorrido += imprimir(root.right, nivel-1, "┌──");
            for (int i = 0; i < altura(pRoot) - nivel; i++) {
                recorrido += "            ";
            }
                recorrido += conector + "(" + root.info + ")";
            /*for (int i = 0; i < nivel-1; i++) {
                if (!esHoja(root)) {
                    recorrido += "";
                } 
            }*/
            recorrido += "\n";
            recorrido += imprimir(root.left, nivel-1, "└──");
        }
        return recorrido;
    }
    
    public NodoBinario<T> ancestroComun(T v, T w) {
        NodoBinario<T> primero = buscarABB(v,pRoot);
        NodoBinario<T> segundo = buscarABB(w,pRoot);
        NodoBinario<T> padre;
        if (primero != null && segundo != null) {
            if (primero != pRoot) {
                padre = padreABB(primero, pRoot);
            }
            else {
                padre = primero;
            }
            if (buscarABB(w, padre) != null && padre != segundo) {
                return padre;
            }
            else {
                return ancestroComun(padre.info, w);
            }
        }
        else {
            return null;
        }
    }
    
}
