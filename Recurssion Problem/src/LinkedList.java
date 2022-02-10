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
    public static void main(String[] args)
    {
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

        // Print the LinkedList
        traverse(list);
    }
}

/*
Linked List:1 2 3 4 5 6 7
*/