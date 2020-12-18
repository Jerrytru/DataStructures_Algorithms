package arrays;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class FindMaximumInSlidingWindow {
    
    
    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize){
         ArrayDeque<Integer> result = new ArrayDeque<Integer>();
         Deque<Integer> list = new LinkedList<Integer>();
    
         if( arr.length > 0 ){ 
             
             if( arr.length < windowSize )  
                 return result;
             
             for ( int i = 0; i < windowSize; ++i){
                 while(!list.isEmpty() && arr[i] >= arr[list.peekLast()]){
                     list.removeLast();
                 }
                 list.addLast(i);
             }
             
             for( int i = windowSize; i < arr.length; ++i){
                 result.add(arr[list.peek()]);
                 
                 while((!list.isEmpty()) && list.peek() <= i-windowSize){
                    list.removeFirst(); 
                 }
                 
                 while((!list.isEmpty()) && arr[i] >= arr[list.peekLast()]){
                     list.removeLast();
                 }
                 list.addLast(i);
                 
             }
             
             result.add(arr[list.peek()]);
             return result;
             
         } else {
              return result;
         }
    }
   

}
