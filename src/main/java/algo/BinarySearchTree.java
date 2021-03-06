package algo;

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x;}
}
//bst는 inorder순회하면 오름차순 정렬된 값을 반환한다.
public class BinarySearchTree {
        Stack<TreeNode> stack = new Stack<>();
        public BinarySearchTree(TreeNode root){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
        }

        public boolean hasNext(){
            return !stack.isEmpty();
        }

        public int next() {
            TreeNode node = stack.pop();
            if (node.right != null) {
                TreeNode cur = node.right;
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
            }
            return node.val;
        }
}
