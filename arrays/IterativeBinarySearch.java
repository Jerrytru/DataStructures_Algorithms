/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author jerry
 */
public class IterativeBinarySearch {
    
    public static int iterativeBinSearch(int[] arr, int key){ 
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];
        int left = 0, right = arr.length-1;
        
        
        
        while ( left <= right ){
            int mid = left + ((right - left) / 2);
            if (arr[mid] == key) return mid;
            
            if (arr[mid] < key ){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}
