package LinkedLists;


public class DetectLoop {
    public static boolean detectLoop(LinkedList list){
        
        Node slow = list.head;
        Node fast = list.head;
        
        while( slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if ( slow == fast ) return true;       
        }
        
        return false;
    }
}
