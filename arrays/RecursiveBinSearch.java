/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author yudithtrujillo
 */
public class RecursiveBinSearch {
    
    public static int recursiveBinarySearch(int[] arr, int key, int left, int right){
        if ( left > right ) return -1;
        if ( arr.length == 1) return arr[0];
        if ( arr.length == 0) return -1;
        
        
        int mid = left + ((right - left) / 2);
        
        if ( arr[mid] == key ){
            return mid;
        } else if( arr[mid] > key) {
            return recursiveBinarySearch(arr, key, left, mid-1);
        } else {
            return recursiveBinarySearch(arr, key, mid+1, right);
        }
    }
}
