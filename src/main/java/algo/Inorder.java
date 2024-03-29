package algo;

class Tree3{
    class Node{
        int data;
        Node left;
        Node right;
        Node parent;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    Tree3 (int size){
        root = makeBST(0,size-1,null);
    }
    Node makeBST(int start,int end, Node parent){
        if(start>end) return null;
        int mid = (start + end) /2;
        Node node = new Node(mid);
        node.left = makeBST(start,mid-1,node);
        node.right = makeBST(mid+1,end,node);
        node.parent = parent;
        return node;
    }
    void findNext(Node node){
        if(node.right ==null){
            System.out.println("findAbove(node.parent,node).data = " + findAbove(node.parent,node).data);
        }else{
            System.out.println("findBelow(node.right).data = " + findBelow(node.right).data);
        }
    }
    Node findAbove(Node root, Node child){
        if(root ==null) return null;
        if(root.left ==child) return root;
        return findAbove(root.parent,root);
    }
    Node findBelow(Node root){
        if(root.left ==null) return root;
        return findBelow(root.left);
    }
}
public class Inorder {
    public static void main(String[] args) {
        Tree3 t = new Tree3(10);
        t.findNext(t.root.left.right.right);
        t.findNext(t.root.left);
        t.findNext(t.root);
        t.findNext(t.root.left.left);
    }
}
