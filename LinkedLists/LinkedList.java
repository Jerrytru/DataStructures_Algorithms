package LinkedLists;

public class LinkedList {
    
   public static Node head;
   
   public static void append(int data){
       if( head == null){
           head = new Node(data);
           return;
       }
       
       Node current = head;
       
       while( current.next != null){
           current = current.next;
       }
       
       current.next = new Node(data);
   }
   
   public static void prepend(int data){
       if( head == null){
           head = new Node(data);
       } else {
           head.next = head;
           head = new Node(data);
       }
   }
   
   public static void deleteWithValue(int data){
       if( head == null) return;
       if( head.data == data ){
           head = head.next;
           return;
       }
       Node current = head;
       
       while(current.next != null){
           if (current.next.data == data){
               current.next = current.next.next;
               return;
           }
           
           current = current.next; 
       }
   }
   
   public static int getSize(LinkedList list){
       if ( list.head == null) return 0;
       int count = 0;
       
       Node current = head;
       while( current != null ){
           count++;
           current = current.next;
       }
       return count;
   }
    
}
