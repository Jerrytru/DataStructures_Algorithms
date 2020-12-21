package LinkedLists;


public class RemoveDuplicates {
    public static void removeDuplicates(LinkedList list){
        Node current = list.head;
        Node compare = null;
        
        while( current != null && current.next != null ){
            compare = current;
            while( compare.next != null ){
                if( current.equals(compare.next)){
                    compare.next = compare.next.next;
                } else {
                    compare = compare.next;
                }
            }
            current = current.next;
        }
    }
    
}
