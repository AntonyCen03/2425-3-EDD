/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author christian
 */
public class Lista {
    public int pFirst, vacio, pLast, Max;
    Nodo[]lista;
    
    
    public Lista(int tam){
        this.Max=tam;
        this.vacio=0;
        this.pFirst=-1;
        this.pLast=-1;
        this.lista=new Nodo[this.Max];
        
    }
    
    public void inicializar(){
        // La posicion equivalente a NULL es en este caso -1.
        int indice=0;
        while (indice < this.Max){
            this.lista[indice]=new Nodo(0,indice+1,indice-1);
            indice++;
        }
        this.lista[indice-1].sig=-1;
        
        
    }
    
    public String Imprimir (){
        int i=0;
        
        return "prueba";
        
    }
    
    private int proximo(int P){
        return this.lista[P].sig;
    }
    
    private int ultimo(){
        return this.pLast;
    }
    
    private int primero(){
        return this.pFirst;
    }
    private boolean es_vacio(){
        return this.pFirst==-1;
    }
    
    private int reservar(){
        return this.vacio;
    }
    private void actualizar_vacio(){
        if (es_posicion_valida(this.vacio)){
            this.vacio=this.proximo(vacio);
            if (this.vacio!=-1){
                this.lista[this.vacio].ant=-1;
            }
        }
       
    }
    
    private boolean es_posicion_valida(int P){
        return P!= -1 && P<=this.Max-1;
    }
    
    // al implementar Buscar, deberia modificarse este metodo.
    public void insertar(int x){
        int p, pAnt, aux;
        
        p=this.reservar();
        if (this.es_posicion_valida(p)){
            this.lista[p].set(x);
            this.actualizar_vacio();
            if (this.es_vacio()){
                this.pFirst=p;
                this.pLast=p;
                this.lista[p].sig=-1;
                this.lista[p].ant=-1;
                
            }else{
                if(this.lista[p].get()< this.lista[this.primero()].get()){
                    this.lista[p].sig=this.primero();
                    this.lista[p].ant=-1;
                    this.lista[this.primero()].ant=p;
                    this.pFirst=p;
                }else{
                    if (this.lista[p].get()>this.lista[this.ultimo()].get()){
                        this.lista[this.ultimo()].sig=p;
                        this.lista[p].sig=-1;
                        this.lista[p].ant=this.ultimo();
                        this.pLast=p;
                   }else{
                        aux=this.primero();
                        pAnt=aux;
                        while(this.lista[aux].get()< this.lista[p].get()){
                            pAnt=aux;
                            aux=this.proximo(aux);
                         }
                        this.lista[pAnt].sig=p;
                        this.lista[aux].ant=p;
                        this.lista[p].sig=aux;
                        this.lista[p].ant=pAnt;
                    }
                }
                  
            }
        }else{
            System.out.print("error");
        }
    }
    
    public void eliminar(int pValor){
        int pAnt, pSig;
        if (this.es_posicion_valida(pValor)){
            if (pValor==this.primero()){
                pAnt=this.primero();
                this.pFirst=this.lista[this.primero()].sig;
                pSig=this.lista[pAnt].sig;
                if(pSig!= -1){
                    this.lista[pSig].ant=-1;
                }
                this.liberar(pValor);
                if (this.primero()==-1){
                    this.pLast=-1;
                }
            }else{
                pAnt= this.lista[pValor].ant;
                pSig=this.lista[pValor].sig;
                this.lista[pAnt].sig=pSig;
                if(pSig!=-1){
                    this.lista[pSig].ant=pAnt;
                }else{
                    this.pLast=pAnt; // se borra el último y hay que cambiar a pLast.
                }
                this.liberar(pValor);
            }
        }
    }
    
    public void liberar(int pValor){
        int pAux;
        boolean encontrado=false;
        if (this.es_posicion_valida(pValor)){
            if (this.vacio==-1){
                this.vacio=pValor;
                this.lista[pValor].sig=-1;
                this.lista[pValor].ant=-1;
            }else{
                pAux=this.vacio;
                while (!encontrado){
                    if (this.lista[pAux].sig==-1){
                        encontrado=true;
                    }else{
                        pAux= this.lista[pAux].sig;
                    }
                }
                this.lista[pAux].sig=pValor;
                this.lista[pValor].sig=-1;
                this.lista[pValor].ant=pAux;
            }
        }
    }
    
    // falta implementar buscar. 
   public int buscar(int info){
       return -1;
   }
}
