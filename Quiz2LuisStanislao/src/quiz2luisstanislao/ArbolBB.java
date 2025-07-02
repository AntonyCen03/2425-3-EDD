/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2luisstanislao;

/**
 *
 * @author Luis Stanislao
 */
public class ArbolBB {
    private NodoABB Root;

    public NodoABB getRoot() {return Root;}

    public ArbolBB() 
    {
        this.Root = null;
    }
    
    public ArbolBB(NodoABB raiz) 
    {
        Root = raiz;
    }
    
    public void InsertarRoot(int dato)
    {
        Root = new NodoABB (dato);
    }
    
    public void Vaciar()
    {
        Root=null;
    }
    
    public boolean EsVacio(NodoABB node)
    {
        return node==null;
    }
    
        public String Preorden(NodoABB root,String cadena)
        {
            if(root!=null)
            {
                cadena=cadena+root.getDato()+", ";
                cadena=Preorden(root.getHijoIzq(),cadena);
                cadena=Preorden(root.getHijoDer(),cadena);
            }
            return cadena;
        }

        public String Posorden(NodoABB root,String cadena)
        {
            if(root!=null)
            {
                cadena=Posorden(root.getHijoIzq(),cadena);
                cadena=Posorden(root.getHijoDer(),cadena);
                cadena=cadena+root.getDato()+", ";
               
            }
            return cadena;
        }

        public String Inorden(NodoABB root, String cadena)
        {
            if(root!=null)
            {
                cadena= Inorden(root.getHijoIzq(),cadena);
                cadena=cadena+root.getDato()+" ";
                //System.out.print(root.getDato()+" ");
                cadena=Inorden(root.getHijoDer(),cadena);
            }
            return cadena;
    }
    
    public NodoABB Buscar(int valor, NodoABB root)
    {
        if(EsVacio(root))
        {
            return null;
        }else
        {
            if(root.getDato()==valor)
            {
                return root;
            }
            else 
            {
                if(valor<root.getDato())
                {
                    return Buscar(valor, root.getHijoIzq());
                }else
                {
                    return Buscar(valor, root.getHijoDer());
                }
            }
        }
        
    }
    
    
    public boolean Insertar(int valor, NodoABB root)
    {
        if(EsVacio(root))
        {
            
            root= new NodoABB(valor);
            return true;
        }else
        {
            if(valor==root.getDato())
            {
                return false;
            }else
            {
                if(valor<root.getDato())
                {
                    if(EsVacio(root.getHijoIzq()))
                    {
                        root.setHijoIzq(new NodoABB(valor));
                        return true;
                    }else
                    {
                        return Insertar(valor, root.getHijoIzq());
                    }
                }else
                {
                    if(EsVacio(root.getHijoDer()))
                    {
                        root.setHijoDer(new NodoABB(valor));
                        return true;
                    }else
                    {
                        return Insertar(valor,root.getHijoDer());
                    }
                }
            }
        }
        
    }
 
    public NodoABB Maximo (NodoABB node) 
    {
        if(node.getHijoDer()==null)
        {
            return node;
        }else
        {
        return Maximo(node.getHijoDer());
        }
    }
    
    public NodoABB Borrar(int valor, NodoABB root)
    {
        NodoABB aux= root;
        if(valor<root.getDato())
        {
            root.setHijoIzq(Borrar(valor,root.getHijoIzq()));
        }else
        {
            if(valor > root.getDato())
            {
                root.setHijoDer((Borrar(valor,root.getHijoDer())));
            }else
            {
                if(root.getHijoIzq()!=null && root.getHijoDer()!=null)
                {
                    NodoABB temp= root;
                    NodoABB mayorIzq= Maximo(root.getHijoIzq());
                    root.setDato(mayorIzq.getDato());
                    temp.setHijoIzq(Borrar(mayorIzq.getDato(),temp.getHijoIzq()));
                }else
                {
                    if (root.getHijoIzq()!=null)
                    {
                        aux=root.getHijoIzq();
                    }else
                    {
                        if(root.getHijoDer()!=null)
                        {
                            aux=root.getHijoDer();
                        }else
                        {
                            aux=null;
                        }
                    }
                }
            }
        }return aux;  
    }
    
    
    public int ACMP (int val1, int val2)
    {
       NodoABB primero= new NodoABB(val1);
       NodoABB segundo= new NodoABB(val2);
       NodoABB ancestro = Ancetro2 (Root, primero, segundo);
       return (int)ancestro.getDato();
       
    }
           
           
    public  NodoABB Ancetro2 (NodoABB root, NodoABB primero, NodoABB segundo) {
    NodoABB aux = root;
 
    while(aux!=null){
        if(aux.getDato()==primero.getDato() || aux.getDato()==segundo.getDato())
        {
            return Padre(aux, Root);
        }
        if(primero.getDato() > aux.getDato() && segundo.getDato() >aux.getDato())
        {
            aux = aux.getHijoDer();
            
        }else if (primero.getDato()<aux.getDato() && segundo.getDato()<aux.getDato())
        {
            
            aux=aux.getHijoIzq();
            
        }else{
            return aux;
        }
    }

    return null;
}
    
    public NodoABB Padre(NodoABB mynode, NodoABB root)
    {
        if (root== null || mynode==null)
        {
            return null;
        }
        else if ((root.getHijoDer()!=null && root.getHijoDer()==mynode)||(root.getHijoIzq()!=null && root.getHijoIzq()==mynode))
        {
            return root;
        }
        else
        {
            NodoABB encontrado=Padre(mynode,root.getHijoIzq());
            if(encontrado==null)
            {
                encontrado=Padre(mynode,root.getHijoDer());
            }
            return encontrado;
        }
    }
    
    
    
   /*public NodoABB Ancestro(int x, int y, NodoABB root, boolean raizancestroX, boolean raizancestroY)
    {
        if(raizancestroX==true && raizancestroY==true)
        {
            NodoABB valor1 = Buscar(x,root);
            if(valor1!=null)
            {
                raizancestroX=true;
            }
            NodoABB valor2 = Buscar(y,root);
            if(valor2!=null)
            {
                raizancestroY=true;
            }

            if(valor1!=null && valor2!=null)
            {

            }
            
        }
    }*/
   
   
   
   
   
    /*public NodoABB Ancestro1(int x, int y, NodoABB root, boolean raizancestroX, boolean raizancestroY)
    {
        if(raizancestroX==true && raizancestroY==true)
        {
            NodoABB valor1 = Buscar(x,root.getHijoIzq());
            NodoABB valor2 = Buscar(y,root.getHijoIzq());
            if(valor1!=null && valor2!=null)
            {
                raizancestroX=true;
                raizancestroY=true;
            }
            valor1 = Buscar(x,root.getHijoDer());
            valor2 = Buscar(y,root.getHijoDer());
            
            if(valor1!=null && valor2!=null)
            {
                raizancestroX=true;
                raizancestroY=true;
            }
            

            
            /*if(valor2!=null)
            {
                raizancestroY=true;
            }
            if(root.getDato()==valor)
            {
                return root;
            }
            else 
            {
                if(valor<root.getDato())
                {
                    return Buscar(valor, root.getHijoIzq());
                }else
                {
                    return Buscar(valor, root.getHijoDer());
                }
            }
        }
    }*/
   
   /*        if(EsVacio(root))
        {
            return null;
        }else
        {
            if(root.getDato()==valor)
            {
                return root;
            }
            else 
            {
                if(valor<root.getDato())
                {
                    return Buscar(valor, root.getHijoIzq());
                }else
                {
                    return Buscar(valor, root.getHijoDer());
                }
            }
        }*/
   


    
    
    
    
    
}
