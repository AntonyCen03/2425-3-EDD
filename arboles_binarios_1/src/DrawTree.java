
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

class DrawTree extends JPanel{
	
	public BinaryTree tree;
	
	public DrawTree(BinaryTree tree){
		this.tree = tree;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
	
		g.setFont(new Font("Tahoma", Font.BOLD, 20));
		//g.drawString(String.valueOf(tree.root.data), this.getWidth()/2, 30);
		

			//DrawNode(g, tree.root,100, 50,2);

		Draw(g, 0, getWidth(), 0, getHeight() / tree.getheight(tree.root), tree.root);
	}

	
    public void Draw(Graphics g, int StartWidth, int EndWidth, int StartHeight, int Level, Node node) {
        String data = String.valueOf(node.get_info());
        g.setFont(new Font("Tahoma", Font.BOLD, 20));
        FontMetrics fm = g.getFontMetrics();
        int dataWidth = fm.stringWidth(data);
        g.drawString(data, (StartWidth + EndWidth) / 2 - dataWidth / 2, StartHeight + Level / 2);

        if (node.Left_child() != null)            
        	Draw(g, StartWidth, (StartWidth + EndWidth) / 2, StartHeight + Level, Level, node.Left_child());
        
        if (node.Right_child() != null)
        	Draw(g, (StartWidth + EndWidth) / 2, EndWidth, StartHeight + Level, Level, node.Right_child());
    }
	
	
}