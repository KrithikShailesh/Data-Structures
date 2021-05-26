package Stack;

public class Stack {

    Node top;

    public void push(int data){

        Node temp = new Node();
        temp.data=data;

        if(temp==null){
            System.out.print("\nHeap Overflow");
            return;
        }
        else{

            temp.next=top;
            top=temp;

        }

    }

    public void pop(){

        if(top==null){
            System.out.println("\nUnderflow");
        }
        else{

            top=top.next;

        }

    }

    public boolean isEmpty(){
        return top == null;
    }

    public void peek(){

        if(!isEmpty()){
            System.out.println(top.data);
        }
        else{
            System.out.println("Stack is empty");
        }

    }
    public void display(){

        Node n=top;

        while(n != null){
            System.out.print(n.data+" ");
            n=n.next;
        }

    }


}
