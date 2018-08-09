import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *    3
 *   / \
 *  9  20
 *  /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
public class Binary_Tree_Level_Order_Traversal_II_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int treeHeight = searchTreeHeight(root);
        List<List<Integer>> treeSet = new ArrayList<List<Integer>>();
        for(int i = 0; i < treeHeight; i++){
            treeSet.add(new ArrayList<Integer>());
        }
        orderSearch(root, 0, treeSet);
        return treeSet;
    }

    public int searchTreeHeight(TreeNode node){
        if(node == null) return 0;
        return 1 + Math.max(searchTreeHeight(node.left) , searchTreeHeight(node.right));
    }

    public void orderSearch(TreeNode node, int level, List<List<Integer>> treeSet){
        int nextlevel = level + 1;
        if(node == null) return;
        treeSet.get(treeSet.size() - 1 - level).add(node.val);
        orderSearch(node.left, nextlevel, treeSet);
        orderSearch(node.right, nextlevel, treeSet);
    }
}
