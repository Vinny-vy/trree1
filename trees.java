import java.util.*;
public class trees {
static class Node
{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}

	Node root;
	public trees()
	{
		root=null;
	}

	void print()
	{
		int h=height(root);
		
		for(int i=0;i<h;i++)
		{
			printlevel(root,i);
		}
	}
	public int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		else {
			int lheight=height(root.left);
			int rheight=height(root.right);
			if(lheight>rheight)
				return (lheight+1);
			else
				return (rheight+1);
		}
	}
	public void printlevel(Node root,int level)
	{
		if(root==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.println(root.data+" ");
		}
		if(level>1)
		{
			printlevel(root.left,level-1);
			printlevel(root.right,level-1);
		}
	}
	public static void main(String args[])
	{
		trees tree = new trees(); 
	       tree.root= new Node(1); 
	       tree.root.left= new Node(2); 
	       tree.root.right= new Node(3); 
	       tree.root.left.left= new Node(4); 
	       tree.root.left.right= new Node(5); 
		tree.print();
		
	}
	
}
