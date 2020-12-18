/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author jerrytrujillo
 */
public class main {
    public static void main (String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,10};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        int[] arr3 = {2,3,4,5,6};
        
        
        
          System.out.println(RecursiveBinSearch.recursiveBinarySearch(arr, 50, 0, 9));
          System.out.println(IterativeBinarySearch.iterativeBinSearch(arr, 90));
          System.out.println(FindMaximumInSlidingWindow.findMaxSlidingWindow(arr, 4));
          System.out.println(FindSmallestCommonNumber.findSmallestCommonNumber(arr1, arr2, arr3));
} 
    
}
