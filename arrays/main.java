/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import LinkedLists.LinkedList;
import LinkedLists.Node;
import LinkedLists.SearchLinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jerrytrujillo
 */
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
       list1.append(2);
       list1.append(2);
       list1.append(2);
       list1.append(2);
       list1.append(2);
       list1.append(7);
       list1.deleteWithValue(2);
        
       System.out.println(list1.getSize(list1));
       System.out.println(SearchLinkedList.searchNode(list1,5));
       Node head = list1.head; 
       System.out.println(head);
       
    }
}
