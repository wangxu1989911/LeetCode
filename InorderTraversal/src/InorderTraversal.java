import java.util.ArrayList;
import java.util.List;

/**
Binary Tree Inorder Traversal
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 */

/**
 * @author Zhendong Xu
 *
 */
public class InorderTraversal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node0=new TreeNode(1);
		TreeNode node1=new TreeNode(2);
		TreeNode node2=new TreeNode(3);
		node0.right = node1;
		node1.left = node2;
		List<Integer> result = new ArrayList<Integer>();
		result = Recursion.inorderTraversal(node0);
		System.out.println("Recursive Solution:" + result);	
		result = Iteration.inorderTraversal(node0);
		System.out.println("Iterative Solution:" + result);
		result = Solution.inorderTraversal(node0);
		System.out.println("Solution:" + result);
	}
}
