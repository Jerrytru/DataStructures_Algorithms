package arrays;

public class MoveAllZeroesToBeginning {
    
    public static void moveZeroesToBeginning(int[] arr){
        
        int read = arr.length-1;
        int write = arr.length-1;
        
        while (read >= 0) {
            if( arr[read] != 0){
               arr[write] = arr[read];
               write--;
            }  
            read--;
        }
        
        while( write >= 0){
            arr[write] = 0;
            write--;
        }
        
       
    }
    
}
