package Stack;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        
        Stack stack=new Stack();

        Scanner sc=new Scanner(System.in);
        String s="";

        do{
            System.out.println("Enter the operation:\n1. Push\n2. Pop\n3. Peek\n4. Display");
            int choice=sc.nextInt();

            if(choice==1){

                System.out.println("Enter the number of elements:");
                int n=sc.nextInt();

                System.out.println("Enter the elements:");
                for(int i=0;i<n;i++){
                    stack.push(sc.nextInt());
                }

                System.out.println("Stack after pushing elements:");
                stack.display();

            }
            else if(choice == 2){

                stack.pop();
                System.out.println("After pop:");
                stack.display();

            }
            else if(choice == 3){
                
                System.out.println("Element at top:");
                stack.peek();
                
            }
            else if(choice == 4){

                System.out.println("The Stack is:");
                stack.display();

            }
            System.out.println("\nDo you want to continue?[Y/N]");
            s=sc.next();
        }while(s.equalsIgnoreCase("Y"));

        sc.close();
    }
}
