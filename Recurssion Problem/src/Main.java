import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5) ;

        int mid =  (myStack.size() / 2 ) + 1 ;
        System.out.println("Top of Stack: " + myStack.peek());
        System.out.println("Middle Of Stack: " + mid);
        System.out.println("Stack Before Deleting Middle Element:");
        for(int i : myStack){
            System.out.print(i + " ");
        }
        System.out.println();
        solve(myStack, mid);
        System.out.println("Stack After Deleting Middle Element:");
        for (int i : myStack){
            System.out.print(i + " ");
        }



    }
    public static void solve(Stack<Integer> s, int k) {
        if(k == 1){
            s.pop() ;
            return;
        }
        int temp = s.peek() ;
        s.pop() ;
        solve(s, k - 1);
        s.push(temp) ;
        return;
    }
}

/*
Top of Stack: 5
Middle Of Stack: 3
Stack Before Deleting Middle Element:
1 2 3 4 5
Stack After Deleting Middle Element:
1 2 4 5
 */