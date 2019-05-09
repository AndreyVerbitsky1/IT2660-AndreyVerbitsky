package finalproject;

import java.util.Queue;
import java.util.LinkedList;

public class BreathFirst {
	
	static void traversal(Node node)
	{
	Queue<Node> q = new LinkedList<Node>();
	
	q.add(node);
	
	
	while(!q.isEmpty())
	{
		node = q.remove();
		
		System.out.println(node.data + " ");
		
		if (node.left != null)
			q.add(node.left);
		
		if(node.right != null)
			q.add(node.right);
		
		}

	}
	
}
