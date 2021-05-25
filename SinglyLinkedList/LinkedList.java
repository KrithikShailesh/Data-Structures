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

    public void sort(){

        Node n=head,index=null;

        int temp;

        while(n!=null){

            index=n.next;

            while(index!=null){

                if(n.data>index.data){
                    temp=n.data;
                    n.data=index.data;
                    index.data=temp;
                }

                index=index.next;

            }

            n=n.next;

        }

    }

    public void getMiddle(){

        Node fast_ptr=head;
        Node slow_ptr=head;

        if(head!=null){

            while(fast_ptr!=null && fast_ptr.next!=null){
                slow_ptr=slow_ptr.next;
                fast_ptr=fast_ptr.next.next;
            }

            System.out.println("The middle element is "+slow_ptr.data+".");

        }

    }

}