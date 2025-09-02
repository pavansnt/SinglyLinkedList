public class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
        System.out.println("New Node created with data = " + data);
    }
}