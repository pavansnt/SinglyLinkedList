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
        if(currentNode == null)
            System.out.print(" null");
    }

    public void testAllOperations()
    {
        insertAtBeginnning(1);
        insertAtBeginnning(2);
        insertAtBeginnning(3);
        printAllOperations();

    }

}
