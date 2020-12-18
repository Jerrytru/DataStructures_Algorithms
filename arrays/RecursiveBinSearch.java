package arrays;


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
