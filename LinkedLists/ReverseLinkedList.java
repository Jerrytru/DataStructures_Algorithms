package LinkedLists;

public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList list){
        Node prev = null;
        Node next = null;
        Node current = list.head;
        
        while( current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
         list.head = prev;
        return list;
    }
}
