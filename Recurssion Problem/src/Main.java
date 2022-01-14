import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>() ;
        myStack.push(1) ;
        myStack.push(2) ;
        myStack.push(3) ;
        myStack.push(4) ;
        myStack.push(5) ;

        System.out.println("Stack before reverse: ");

        for (int i : myStack){
            System.out.print(i + " ");
        }
        System.out.println();

        reverse(myStack);

        System.out.println("Stack after reverse:");
        for(int i : myStack){
            System.out.print(i + " ");
        }

    }
    public static void reverse(Stack<Integer> stack) {
        if(stack.size() == 1){
            return;
        }
        int temp = stack.peek() ;
        stack.pop() ;
        reverse(stack);
        insert(stack,temp);
        return;
    }
    public static void insert(Stack<Integer> stack, int element) {
        if(stack.size() == 0){
            stack.push(element );
            return;
        }
        int temp = stack.peek() ;
        stack.pop() ;
        insert(stack, element);
        stack.push(temp) ;
        return;
    }
}

/*
OUTPUT:

Stack before reverse:
1 2 3 4 5
Stack after reverse:
5 4 3 2 1

 */