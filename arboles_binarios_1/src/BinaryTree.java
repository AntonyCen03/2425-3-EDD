

public class BinaryTree {
	Node root;

	public BinaryTree() {
		this.root = null;
	}
        public boolean its_empty(Node n){
            return n==null;
        }
	public void insertLeft(int parent, int leftvalue) {
		Node n = findInPreOrder(root, parent);
		Node leftchild = new Node(leftvalue);
		n.Set_Left_child(leftchild);
	}
        
        public void vaciar(){
            this.root=null;
        }

	public void insertRight(int parent, int rightvalue) {
		Node n = findInPreOrder(root, parent);
		Node rightchild = new Node(rightvalue);
		n.Set_Right_child(rightchild);
	}

	public void insertRoot(int data) {
		root = new Node(data);
	}

	public Node getRoot() {
		return root;
	}

	
        	public Node find(Node n, int key) {
                    
                    if (n == null){
			return null;
                    }else{
                        if (n.get_info() == key){
                           return n; 
                        }else{
                            if (n.get_info()> key){
                                return find (n.Left_child(),key);
                            }else{
                                return find(n.Right_child(),key);
                            }
                        }
                    }
                }

	public int getheight(Node root) {
		if (root == null)
			return 0;
		return Math.max(getheight(root.Left_child()), getheight(root.Right_child())) + 1;
	}

	public void printTree(Node n) {
		if (n == null)
			return;
		printTree(n.Left_child());
		n.displayNode(n);
		printTree(n.Right_child());
	}
	
	public void PreOrder(Node n ){
		
		if (n == null)
			return;
		n.displayNode(n);
		PreOrder(n.Left_child());
		PreOrder(n.Right_child());
	}
	
	public void InOrder(Node n ){
		
		if (n == null)
			return;
		InOrder(n.Left_child());
		n.displayNode(n);
		InOrder(n.Right_child());
	}
	
	public void PostOrder(Node n ){
		
		if (n == null)
			return;
		PostOrder(n.Left_child());
		PostOrder(n.Right_child());
		n.displayNode(n);
	}
        
        public String PreOrden(Node n){
            if (n==null) {
                return "";
            }
            String cadena= String.valueOf(n.get_info())+",";
            cadena+=PreOrden(n.Left_child());
            cadena+=PreOrden(n.Right_child());
            return cadena;
        }
        
        public String InOrden(Node n){
            if (n==null) {
                return "";
            }
            String cadena= InOrden(n.Left_child());
            cadena+= String.valueOf(n.get_info())+",";
            cadena+=InOrden(n.Right_child());
            return cadena;
        }
        
        public String PosOrden(Node n){
            if (n==null) {
                return "";
            }
            String cadena= PosOrden(n.Left_child());
            cadena+=PosOrden(n.Right_child());
            cadena+= String.valueOf(n.get_info())+",";
            return cadena;
        }
        
        
/**
 * 
 * @param clave
 * @param ABB
 * @return boolean
 * Precondicion: solo inserta valores no existentes en el arbol. 
 * Insercion iterativa.
 */	
	public boolean Insert_iterate(int clave, Node ABB){
            Node donde, padre;
            boolean encontrado= false;
            padre=null;
            donde= ABB;
            while (!its_empty(donde) && !encontrado){
                padre=donde;
                if (clave==donde.get_info()){
                        encontrado=true;
                }else{
                    if(clave< donde.get_info() ){
                        donde=donde.Left_child();
                    }else{
                        donde=donde.Right_child();
                    }
                }
            }
            // insert.
            if(!encontrado){
                donde=new Node(clave);
                if(its_empty(padre)){
                    ABB=donde; // first node.
                }else{
                    if(clave < padre.get_info()){
                        padre.Set_Left_child(donde);
                    }else{
                        padre.Set_Right_child(donde);
                    }
                }
                return true;
            }else{
                return false;
            }
        }
        
 /**
  * Insercion recursiva.
  * Solo inserta valores no repetidos.
  * @param clave
  * @param ABB
  * @return 
  */
            public Node Insert_recur(int clave, Node ABB){
                
            if(its_empty(ABB)){
                return new Node(clave);
                
            } else{
                if(clave==ABB.get_info()){
                    System.out.print("Valor repetido");
                    return ABB;
                }else{
                    if(clave<ABB.get_info()){
                        ABB.Set_Left_child(Insert_recur(clave,ABB.Left_child()));
                    }else{
                        ABB.Set_Right_child(Insert_recur(clave,ABB.Right_child()));
                        }
                    }
            }
            return ABB;
        } 
    
     /**
      * Precondicion: el nodo a eliminar, debe existir en el arbol.
      * @param Elem
      * @param ABB
      * @return 
      */
        
        public Node Delete(int Elem, Node ABB){
            Node resp=ABB;
            if (Elem< ABB.get_info()) {
                ABB.Set_Left_child(Delete(Elem,ABB.Left_child()));
            }else{
                if(Elem > ABB.get_info()){
                    ABB.Set_Right_child(Delete(Elem,ABB.Right_child()));
                }else{
                    if(ABB.Left_child()!= null && ABB.Right_child()!= null){
                        Node temp=ABB;
                        Node Max_Izq =Max(ABB.Left_child());
                        ABB.Set_info(Max_Izq.get_info());
                        temp.Set_Left_child(Delete(Max_Izq.get_info(),temp.Left_child()));
                       }else{
                            if(ABB.Left_child()!=null){
                                resp=ABB.Left_child();
                            }else{
                                if(ABB.Right_child()!=null){
                                    resp=ABB.Right_child();
                                }else{
                                    resp=null;
                                }
                            }
                    }
                }
            }
            return resp;
        }
        
        
        public Node Max(Node n) {
            if (n.Right_child() == null) {
                return n;
            } else {
                return Max(n.Right_child());
    }
}
        
               
        public Node findInPreOrder(Node n, int key) {
     
        if (n == null) {
            return null;
        }
        if (n.get_info() == key) {
            return n; // Hemos encontrado el nodo, lo devolvemos.
        }

        Node result = findInPreOrder(n.Left_child(), key);
        if (result != null) {
            return result; // Si lo encontramos en el subárbol izquierdo, lo devolvemos.
        }

        result = findInPreOrder(n.Right_child(), key);
        
        return result;
    }

}