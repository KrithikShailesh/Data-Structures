package SinglyLinkedList;
import java.util.*;

public class Runner {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        
        String ch="";
        
            do{
                System.out.println("Enter the operation you need to perform:\n1. Append\n2. Insert At Beginning\n3. Insert At Position\n4. Insert at Middle\n5. Sort\n6. Get the Middle Element\n7. Get the Smallest Element\n8. Get the Maximum Element\n9. Delete the Element at Position");
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
                else if(choice==4){

                    System.out.println("Enter the value:");
                    int val=sc.nextInt();

                    list.insertAtMid(val);

                    list.show();

                }
                else if(choice == 5){

                    list.sort();

                    list.show();

                }
                else if(choice == 6){

                    list.getMiddle();

                }
                else if(choice == 7){

                    list.smallestEle();

                }
                else if(choice == 8){

                    list.getMax();

                }
                else if(choice == 9){

                    System.out.println("Enter the position:");
                    int pos=sc.nextInt();

                    list.deletePos(pos);

                    list.show();

                }
                System.out.println();
                System.out.println("Do you want to continue?[Y/N]");
                ch=sc.next();
                
                
        }while(ch.equalsIgnoreCase("Y"));

        sc.close();
        
    }

}
    

