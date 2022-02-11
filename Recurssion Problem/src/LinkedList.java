// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node tn = list.head;
            while (tn.next != null) {
                tn = tn.next;
            }

            // Insert the new_node at last node
            tn.next = new_node;
        }

        // Return the list by head
        return list;
    }
    public static void insertAtBeginning(LinkedList list, int val){
        Node nn = new Node(val) ;
        nn.next = null ;
        nn.next = list.head ;
        list.head = nn ;
    }
    public static void insertAtIndex(LinkedList list, int val, int index){
        Node tn = list.head ;
        Node nn = new Node(val) ;
        nn.next = null ;
        int i = 0 ;
        while(i != index - 1){
            tn = tn.next ;
            i++ ;
        }
        nn.next = tn.next ;
        tn.next = nn ;

    }
    public static void deleteFirstNode(LinkedList list){
        if (list.head == null) {
            System.out.println("Empty Linked List");
        }
        list.head = list.head.next ;
    }
    public static void deleteLastElement(LinkedList list){
        if (list.head == null){
            System.out.println("Empty Linked List");
        }
        Node tn = list.head ;
        while (tn.next.next != null){
            tn = tn.next ;
        }
        tn.next = null ;

    }

    // Method to print the LinkedList.
    public static void traverse(LinkedList list){
        if (list.head == null){
            System.out.println("Linked List is Empty");
        }
        Node tn = list.head ;
        System.out.print("Linked List:");
        while (tn != null){
            System.out.print(tn.data + " ");
            tn = tn.next ;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        System.out.println("After Insertion");
        // Print the LinkedList
        traverse(list); // Linked List:1 2 3 4 5 6 7

        deleteLastElement(list);
        System.out.println();
        System.out.println("After Deleting Last Element");
        traverse(list); // Linked List:1 2 3 4 5 6

        insertAtBeginning(list,20);
        System.out.println();
        System.out.println("After Inserting Element at Beginning");
        traverse(list); // Linked List:20 1 2 3 4 5 6

        insertAtBeginning(list,150);
        System.out.println();
        traverse(list); // Linked List:150 20 1 2 3 4 5 6

        insert(list, 80) ;
        System.out.println();
        traverse(list); // Linked List:150 20 1 2 3 4 5 6 80

        deleteFirstNode(list);
        System.out.println();
        System.out.println("After Deleting First Node");
        traverse(list);

        insertAtIndex(list,10,2);
        System.out.println();
        System.out.println("Inserting at index");
        traverse(list);

    }
}

/*
Inserting at index
Linked List:20 1 10 2 3 4 5 6 80
*/