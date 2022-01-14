import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>() ;
        myStack.push(0) ;
        myStack.push(1) ;
        myStack.push(5) ;
        myStack.push(2) ;

        System.out.println("stack of top: " + myStack.peek());

        System.out.println("Stack without Sort: ");
        for(int i : myStack){
            System.out.print(i + " ");
        }
        sortMyStack(myStack);
        System.out.println();
        System.out.println("Stack with Sort: ");
        for (int i : myStack){
            System.out.print(i + " ");
        }
    }
    public static void sortMyStack(Stack<Integer> s){
        if(s.size() == 1){
            return;
        }
        int temp = s.peek() ;
        s.pop() ;
        sortMyStack(s);
        insert(s, temp);
        return;
    }
    public static void insert(Stack<Integer> s, int temp) {
        if (s.size() == 1 || s.size() <= temp) {
            s.push(temp) ;
            return;
        }
        int val = s.peek() ;
        s.pop() ;
        insert(s,temp);
        s.push(val) ;
        return;
    }
}

/*
OUTPUT:
stack of top: 2
Stack without Sort:
0 1 5 2
Stack with Sort:
0 1 2 5
 */