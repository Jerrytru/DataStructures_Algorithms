package LinkedLists;

public class ReverseLinkedList {
    public static Node reverseLinkedList(LinkedList list){
        Node prev = null;
        Node next = null;
        Node current = list.head;
        
        while( current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return list.head;
        
    }
}
