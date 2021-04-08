package algo;

import java.util.HashMap;

class Tree4{
    static class Node{
        int data;
        Node left;
        Node right;
        Node parent;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    HashMap<Integer,Node> rootMap;
    Tree4(int size){
        rootMap = new HashMap<Integer,Node>();
        root = makeBST(0,size-1,null);
    }
    Node makeBST(int start, int end,Node parent){
        if(start>end) return null;
        int mid = (start+end)/2;
        Node node = new Node(mid);
        node.left = makeBST(start,mid-1,node);
        node.right = makeBST(mid+1,end,node);
        node.parent = parent;
        rootMap.put(mid,node);
        return node;
    }
    Node getNode(int data){
        return rootMap.get(data);
    }
    Node commonAncestor(int d1,int d2){
        Node p = getNode(d1);
        Node q = getNode(d2);
        int diff = depth(p) - depth(q);
        Node first = diff > 0? q:p;
        Node second = diff >0? p:q;
        second = goUpBy(second,Math.abs(diff));
        while(first!=second&&first!=null&&second!=null){
            first = first.parent;
            second = second.parent;
        }
        return first == null || second == null ? null : first;
    }
    Node goUpBy(Node node,int diff){
        while(diff>0&&node!=null){
            node = node.parent;
            diff--;
        }
        return node;
    }
    int depth(Node node){
        int depth = 0;
        while(node!=null){
            node = node.parent;
            depth++;
        }
        return depth;
    }

}

public class SameParentNode {
    public static void main(String[] args) {
        Tree4 t = new Tree4(10);
        Tree4.Node fa = t.commonAncestor(3,5);
        System.out.println("fa.data = " + fa.data);
    }
}
