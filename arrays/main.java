package arrays;

import LinkedLists.LinkedList;
import LinkedLists.Node;
import LinkedLists.SearchLinkedList;
import LinkedLists.ReverseLinkedList;
import LinkedLists.DetectLoop;
import LinkedLists.RemoveDuplicates;
import LinkedLists.MiddleNode;
import LinkedLists.IntersectionAndUnion;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class main {
    public static void main (String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,10,0,0,0,0,0,0,0,0};
        int[] arr1 = {1,2,3,4,3,2,1,2,5};
        int[] arr2 = {4,5,6,7,8};
        int[] arr3 = {2,3,4,5,6};
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        
       LinkedList list1 = new LinkedList();
       list1.append(1);
       list1.append(2);
       list1.append(3);
       list1.append(4);
       list1.append(6);
       list1.append(6);
       list1.deleteWithValue(2);
       
       LinkedList list2 = new LinkedList();
       list2.append(1);
       list2.append(2);
       list2.append(3);
       list2.append(8);
       list2.append(9);
       list2.append(9);
        
//       System.out.println(list1.getSize(list1));
//       System.out.println(SearchLinkedList.searchNode(list1,5));
//       Node head = list1.head; 
//      
//       list1.display();
//       ReverseLinkedList.reverseLinkedList(list1);
//       list1.display();
//       System.out.println(DetectLoop.detectLoop(list1));
//       System.out.println(LinkedLists.MiddleNode.midNode(list1));
//       
//       LinkedLists.RemoveDuplicates.removeDuplicates(list1);
       list1.display();
       list2.display();
       
       
       
       
       
       
    }
}
