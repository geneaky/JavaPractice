package algo;


import java.util.LinkedList;

class Graph1{
    class Node{
        int data;
        boolean marked;
        LinkedList<Node> adjacent;
        Node(int data){
            this.data = data;
            this.marked = false;
            this.adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;

    Graph1(int size){
        nodes = new Node[size];
        for(int i = 0; i< size; i++){
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1,int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)){
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }

    void initMarks(){
        for(Node n: nodes){
            n.marked = false;
        }
    }
    boolean search(int i1,int i2){
        return search(nodes[i1],nodes[i2]);
    }
    boolean search(Node start, Node end){
        initMarks();
        LinkedList<Node> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            Node root = q.removeFirst();
            if(root ==end){
                return true;
            }
            for(Node n: root.adjacent){
                if(n.marked == false){
                    n.marked = true;
                    q.add(n);
                }
            }
        }
        return false;
    }
}

public class TwoPointGraph {
    public static void main(String[] args) {
        Graph1 g = new Graph1(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);

        System.out.println(g.search(1,8));
    }
}
