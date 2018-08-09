/**
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 * [1,2,3],   [1,2,3]
 *
 * Output: true
 * Example 2:
 *
 * Input:     1         1
 *           /           \
 *          2             2
 *
 * [1,2],     [1,null,2]
 *
 * Output: false
 * Example 3:
 *
 * Input:     1         1
 *           / \       / \
 *          2   1     1   2
 *
 * [1,2,1],   [1,1,2]
 *
 * Output: false
 */
public class Same_Tree_100 {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        boolean isLeftSame = isSameTree(p.left, q.left);
        if(!isLeftSame) return false;
        boolean isCurrentSame = p.val == q.val ? true : false;
        if(!isCurrentSame) return false;
        boolean isRightSame = isSameTree(p.right, q.right);
        return isRightSame;
    }

}
