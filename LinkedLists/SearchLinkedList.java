/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 *
 * @author yudithtrujillo
 */
public class SearchLinkedList {
    
    public static boolean searchNode(LinkedList list, int data){
        if (list.head == null) return false;
        Node current = list.head;
        
        while ( current != null) {
            if( current.data == data) {
                return true;
            }
            current = current.next;
        }
          
        return false;
    }
}
