package LinkedLists;


public class MiddleNode {
    
    public static int midNode(LinkedList list){
        Node mid = list.head;
        Node runner = list.head;
        
        while( mid != null && runner != null && runner.next != null ){
            runner = runner.next.next;
            
            if ( runner != null){
                mid = mid.next;
            }
        }
        return mid.data;
    }
    
}
