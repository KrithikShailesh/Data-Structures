package SinglyLinkedList;
import java.util.*;

public class Runner {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        
        String ch="";
        
            do{
                System.out.println("Enter the operation you need to perform:\n1. append\n2.insertAtBeginning\n3. Insert At Position");
                int choice=sc.nextInt();

                if(choice==1){
                    
                    System.out.println("Enter the number of nodes:");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){

                        list.appendNode(sc.nextInt());

                    }
                    System.out.println("The linked list is:");
                    list.show();

                }
                else if(choice==2){
                    
                    System.out.println("Enter the number of nodes:");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++){

                        list.insertAtBeg(sc.nextInt());

                    }
                    System.out.println("The linked list is:");
                    list.show();
                }

                else if(choice==3){
                    System.out.println("Enter the position where you want to insert:");
                    int pos=sc.nextInt();
                    System.out.println("Enter the value:");
                    int val=sc.nextInt();

                    list.insertAtPos(pos, val);
                    list.show();
                }
                
                System.out.println();
                System.out.println("Do you want to continue?[Y/N]");
                ch=sc.next();
                sc.close();
                
        }while(ch.equalsIgnoreCase("Y"));

        
    }

}
    

