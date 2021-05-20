package SinglyLinkedList;
public class LinkedList{

    Node head;

    public void appendNode(int data){

        Node new_node=new Node();

        new_node.data=data;
        new_node.next=null;

        if(head==null){

            head=new_node;

        }

        else{

            Node n=head;

            while(n.next != null){

                n=n.next;

            }

            n.next=new_node;

        }

    }

    public void show(){

        Node n=head;

        while(n != null){

            System.out.print(n.data+" ");
            n=n.next;

        }

    }

    public void insertAtBeg(int data){

        Node new_node=new Node();
        new_node.data=data;
        new_node.next=head;
        head=new_node;
    }

    public void insertAtPos(int pos, int data){

        int count=1;
        Node n=head;

        Node new_node=new Node();
        new_node.data=data;
        new_node.next=null;

        while(pos-1!=count){
            n=n.next;
            count++;
        }

        new_node.next=n.next;
        n.next=new_node; 

    }

    public void insertAtMid(int data){

        int count=0;

        Node n=head;

        while(n !=null){

            count++;
            n=n.next;

        }

        int pos=count/2;
        int cpos=1;
        Node nn=head;

        Node new_node=new Node();
        new_node.data=data;
        new_node.next=null;

        while(cpos!=pos){
            cpos++;
            nn=nn.next;
        }

        new_node.next=nn.next;
        nn.next=new_node;

    }

    

}