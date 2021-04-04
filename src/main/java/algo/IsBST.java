package algo;

class Tree2{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    int size;
    Tree2(int size){
        this.size = size;
        root = makeBST(0,size-1);
    }
    Node makeBST(int start,int end){
        if(start>end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(mid);
        node.left = makeBST(start,mid - 1);
        node.right = makeBST(mid+1,end);
        return node;
    }
    boolean isValidateBST1(){
        int[] array = new int[size];
        inorder(root,array);
        for(int i = 1; i<array.length; i++){
            if(array[i] < array[i-1]){
                return false;
            }
        }
        return true;
    }
    int index = 0;
    void inorder(Node root,int[] array){
        if(root != null){
            inorder(root.left,array);
            array[index] = root.data;
            index++;
            inorder(root.right,array);
        }
    }
    Integer last_printed = null;
    boolean isValidateBST2(){
        return isValidateBST2(root);
    }
    boolean isValidateBST2(Node n){
        if(n == null) return true;
        if(!isValidateBST2(n.left)) return false;
        if(last_printed != null && n.data< last_printed){
            return false;
        }
        last_printed = n.data;
        if(!isValidateBST2(n.right)) return false;
        return true;
    }
    boolean isValidateBST3(){
        return isValidateBST3(root,Integer.MIN_VALUE,Integer.MIN_VALUE);
    }
    boolean isValidateBST3(Node n,int min,int max){
        if(n==null){
            return true;
        }
        if(n.data<min || n.data > max){
            return false;
        }
        if(!isValidateBST3(n.left,min,n.data) || !isValidateBST3(n.right,n.data,max)){
            return false;
        }
        return true;
    }
}

public class IsBST {
    public static void main(String[] args) {
        Tree2 t = new Tree2(10);
        System.out.println(t.isValidateBST3());

    }
}
