
public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int ddata) {
		this.data = ddata;
		this.left = null;
		this.right = null;
	}

	public void displayNode(Node n) {
		System.out.print(n.data + " ");
	}
        
        public int get_info(){
            return this.data;
        }
        public void Set_info(int data){
            this.data=data;
        }
        public Node Left_child(){
            return this.left;
        }
         public Node Right_child(){
            return this.right;
        }
         public void Set_Left_child(Node n){
             this.left=n;
         }
         public void Set_Right_child(Node n){
             this.right=n;
         }

}
