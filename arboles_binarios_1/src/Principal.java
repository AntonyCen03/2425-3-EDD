

public class Principal{
  
    
	/**
	 * @param args
	 */
	
          
    
    public static void main(String[] args) {
		//Se construye el arbol original
		
            Solucion solucion=new Solucion();
            solucion.OriginalTree.insertRoot(50);
            solucion.OriginalTree.insertLeft(50, 26);
            solucion.OriginalTree.insertRight(50, 96);
            solucion.OriginalTree.insertLeft(26, 86);
            solucion.OriginalTree.insertRight(26, 4);
            solucion.OriginalTree.insertLeft(86,100);
            solucion.OriginalTree.insertRight(4, 24);
            solucion.OriginalTree.PostOrder(solucion.OriginalTree.root);
            
            solucion.convertToBST();
            System.out.println("\nPosOrden: ");
            solucion.NewTree.PostOrder(solucion.NewTree.root);
            System.out.println("\n");
            System.out.println("\nInOrden: ");
            solucion.NewTree.InOrder(solucion.NewTree.root);
            System.out.println("\n");
            System.out.println("\nPreOrden: ");
            solucion.NewTree.PreOrder(solucion.NewTree.root);
            System.out.println("\n");
            
            
            treeGUI gui = new treeGUI(solucion.OriginalTree);
            Interfaz ventana=new Interfaz();
            ventana.show();
            ventana.setLocationRelativeTo(null);

	}

}
