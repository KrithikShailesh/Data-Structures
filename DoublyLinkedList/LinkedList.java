package DoublyLinkedList;

public class LinkedList {

    Node head;

    public void append(int data){

        Node new_node=new Node();
        new_node.data=data;
        new_node.next=null;
        new_node.prev=null;

        if(head == null){
            new_node.prev=null;
            head=new_node;
        }
        else{

            Node n=head;

            while(n.next!=null){
                n=n.next;
            }

            n.next=new_node;
            new_node.prev=n;

        }
    }

    public void display(){

        Node n=head;

        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }

    }
    
}
