
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class Solucion {
    
    BinaryTree OriginalTree, NewTree;
    
    public Solucion(){
        this.OriginalTree=new BinaryTree();
        this.NewTree=new BinaryTree();
        
    }
    
    // Agregue el metodo para generar un ABB a partir de un BB.
    public void convertToBST() {
        // 1. Extraer todos los valores del árbol original
        int[] values = extractAllValues(OriginalTree.getRoot());
        
        // 2. Ordenar los valores (implementación manual)
        bubbleSort(values);
        
        // 3. Construir el nuevo ABB balanceado
        NewTree.root = buildBalancedBST(values, 0, values.length - 1);
    }
    
    private int[] extractAllValues(Node root) {
        int count = countNodes(root);
        int[] values = new int[count];
        extractValues(root, values, new int[]{0});
        return values;
    }
    
    private int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.Left_child()) + countNodes(node.Right_child());
    }
    
    private void extractValues(Node node, int[] values, int[] index) {
        if (node == null) return;
        extractValues(node.Left_child(), values, index);
        values[index[0]++] = node.get_info();
        extractValues(node.Right_child(), values, index);
    }
    
    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    private Node buildBalancedBST(int[] values, int start, int end) {
        if (start > end) return null;
        
        int mid = (start + end) / 2;
        Node node = new Node(values[mid]);
        
        node.Set_Left_child(buildBalancedBST(values, start, mid - 1));
        node.Set_Right_child(buildBalancedBST(values, mid + 1, end));
        
        return node;
    }
    
    // Método para verificar si el árbol resultante es un ABB
    public boolean isBST() {
        return isBSTUtil(NewTree.getRoot(), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBSTUtil(Node node, int min, int max) {
        if (node == null) return true;
        
        if (node.get_info() < min || node.get_info() > max) return false;
        
        return isBSTUtil(node.Left_child(), min, node.get_info() - 1) &&
               isBSTUtil(node.Right_child(), node.get_info() + 1, max);
    }
    
}
