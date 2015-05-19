import java.util.ArrayList;
import java.util.List;

/**
 * Recursive Solution
 */

/**
 * @author Zhendong Xu
 *
 */
public class Recursion {
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        traverse(root, result);
        return result;
    }

    private static void traverse(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        
        traverse(root.left, result);
        result.add(root.val);
        traverse(root.right, result);
    }
}
