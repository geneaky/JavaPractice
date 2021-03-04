package algo;

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data =data;
    }

    void append(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d){
        Node n = this;
        while(n.next != null){
            if(n.next.data==d){
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
    }

    void retrieve(){
        Node n = this;
        while(n.next != null){
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class OneWayLinkedList {
    public static void main(String[] args) {
        Node node = new Node(3);
        node.append(2);
        node.append(40);
        node.append(20);
        node.append(58);
        node.delete(40);
        node.retrieve();
    }
}
