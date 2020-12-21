package LinkedLists;

public class IntersectionAndUnion {
    
//    public static LinkedList intersection(LinkedList list1, LinkedList list2){
//        
//    }
//    
    public static LinkedList union(LinkedList list1, LinkedList list2){
        LinkedList result = new LinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;
        
        
        while( current1 != null ){
            result.append(current1.data);
            current1 = current1.next;
        }
        
        while( current2 != null)
         if( contain(result, current2) == false ){
            result.append(current2.data);
            current2 = current2.next;
        }
        
        return result;
    }
    
    
    public static boolean contain(LinkedList list1, Node node){
        Node current = list1.head;
        
        while ( current != null ){
            if( current.equals(node.data)){
                return true;
            }
            current = current.next;
        }
        
        
        return false;
    }
            
    
}
