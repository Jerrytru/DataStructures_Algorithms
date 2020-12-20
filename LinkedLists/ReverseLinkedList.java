package LinkedLists;

public class ReverseLinkedList {
    public static LinkedList reverseLinkedList(LinkedList list){
      Node current = list.head;
      Node next = null;
      Node prev = null;
      
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
