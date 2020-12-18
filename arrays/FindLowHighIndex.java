package arrays;

import java.util.List;

public class FindLowHighIndex {
    
    public static int findLowIndex(List<Integer> arr, int key){
        int i = 0;

        while( i < arr.size()){
            if( arr.get(i) == key){
                return i;
            } else {
                i++;
                }
            }
        
            return -1;
        }
    
        
    

    public static int findHighIndex(List<Integer> arr, int key) {
   
        int j = 0;
   
        while (j < arr.size()){
            if ( arr.get(j) == key && arr.get(j+1) != key ){
                return j;
            } else {
                j++;
            }
        }
        
        return -1;
    }
} 
    

