package arrays;


public class SearchRotatedArray {
    
  public static int binarySearch(int[] arr, int key) {
    // assuming all the keys are unique.
    
    int start = 0;
    int end = arr.length-1;
    
    if (start > end) {
      return -1;
    }
    
    while( start <= end ){
       int mid = start + ((end - start) / 2);
       
       if ( arr[start] <= arr[mid] && key <= arr[mid] && key >= arr[start] ){
           end = mid -1;
       } else if ( arr[end] >= arr[mid] && key >= arr[mid] && key <= arr[end]){
           start = mid + 1;
       } else if ( arr[start] >= arr[mid]){
           end = mid-1;
       } else if (arr[end] <= arr[mid] ){
           start = mid + 1;
       }
    }

    
    return -1;
  }
}
