package Stack;

import java.util.*;

class Driver{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        Stack<Integer> I = new Stack<Integer>();

        int choice;
        
        System.out.println ("\n##     STACK  PROGRAM     ##\n");

        do {
            System.out.print("What do you want to do ?\nOptions are as follows:\n-----------------------------\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\nEnter your Choice : ");
            choice=sc.nextInt();

            switch (choice){
                case 1 -> {
                    System.out.print("Enter Element : ");
                    int i=sc.nextInt();
                    try{
                    
                    if(I.push(i)){
                        System.out.println("-> "+i+" is pushed successfully.");
                    }
                    }
                    catch(FullStackException e){
                    	System.out.println (e);
                    }
                }
                case 2 -> {
                	try{
                	
                    if(I.pop()){
                        System.out.println("-> Top of the stack is popped successfully");
                    }
                    else{
                        System.out.println("Stack is underflow");
                    }
                	}
                	catch(EmptyStackException e){
                		System.out.println (e);
                	}
                }
                case 3 -> {
                	try{
                	
                    if(I.peek()!=null) {
                        System.out.println("Top of the Stack Element is : " + I.peek());
                    }
                	}
                    catch(EmptyStackException e){
                    	System.out.println (e);
                    }
                }
                case 4 -> {
                    if (Objects.equals(I.toString(), "\0"))
                    {
                        System.out.println("Stack is underflow");
                    }
                    else {
                        System.out.println("## Stack ##");
                        System.out.println(I);
                    }
                }
                case 5 -> {
                    System.out.println("Process is QUIT successfully.");
                }
                default -> System.out.println("Invalid Choice");
            }
            System.out.println("======================================");
        }while(choice!=5);

    }
}
