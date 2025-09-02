public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList()
    {
    //A linked list starts as empty,So when you first create it, you don’t need any input.
    //That’s why it has a no-argument constructor → it just sets head = null.
        this.head = null;
    }

    //it does not matter  whether there are any nodes or not
    //we  can set next to current head
    //and make newNode as current head

    public void insertAtBeginnning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
    }

    public void insertAtEnd(int data)
    {   Node newNode = new Node(data);
        if(this.head ==  null){
            this.head = newNode;
            System.out.println("List was empty so newNode assigned to head");
            return;
        }

        Node currentNode = this.head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        
        System.out.println("inserted at end " + newNode.data);

    }

    public void insertAtPosition(int data, int targetPosition)
    {
        if(targetPosition <= 0){
            System.err.println("invalid position");
            return;
        }

        if(targetPosition == 1){
            this.insertAtBeginnning(data);
            return;
        }

        Node currentNode = this.head;
        int currentPosition = 1;

        while (currentPosition < targetPosition - 1 && currentNode != null) {
            currentNode = currentNode.next;
            currentPosition++;
        }
        
        if (currentNode == null) {
        System.err.println("Invalid position! Out of range.");
        return;
        }
        
        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }

    public void testMethod(){
        insertAtBeginnning(1);  // List: 1
        insertAtBeginnning(2);  // List: 2 -> 1
        insertAtPosition(3, 3);
        // insertAtPosition(1,-1);
        // insertAtPosition(1,0);

        // insertAtBeginnning(1);
        // insertAtPosition(2,1);

        // insertAtPosition(3,3);
        // insertAtPosition(10,4);
        printAllOperations();
    }

    public void printAllOperations()
    {
        if(this.head ==  null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode =  this.head;
        while(currentNode != null){
            System.out.print(" " + currentNode.data + " -->");
            currentNode = currentNode.next;

        }
        System.out.println("null");

    }

    // public void testAllOperations()
    // {
    //     insertAtBeginnning(1);
    //     insertAtBeginnning(2);
    //     insertAtBeginnning(3);
    //     insertAtEnd(4);
    //     insertAtEnd(5);
    //     insertAtEnd(6);
    //     insertAtEnd(7);

        
    //     printAllOperations();

    // }

}
