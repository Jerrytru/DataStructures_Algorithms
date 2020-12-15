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
        
          System.out.println(RecursiveBinSearch.recursiveBinarySearch(arr, 50, 0, 9));
          System.out.println(IterativeBinarySearch.iterativeBinSearch(arr, 90));
} 
    
}
