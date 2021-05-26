package DoublyLinkedList;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of nodes:");

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            list.append(sc.nextInt());
        }

        list.display();
        
    }
}
