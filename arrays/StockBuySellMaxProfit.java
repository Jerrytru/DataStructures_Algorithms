package arrays;


public class StockBuySellMaxProfit {
    
    public static int[] stockMaxProfit( int[] arr){
        
        int[] result = new int[2];
        int lowBuy = arr[0];
        int highSell = arr[1];
        int globalProfit = highSell - lowBuy;
        int currentProfit = Integer.MIN_VALUE;
        
        
        for(int i = 1; i < arr.length; i++){
            currentProfit = arr[i] - lowBuy;
            
            if (currentProfit > globalProfit) {
                globalProfit = currentProfit;
                highSell = arr[i];
            }
            
            if (lowBuy > arr[i]){
                lowBuy = arr[i];
            }
        }
        
        result[0] = lowBuy;
        result[1] = highSell;
        
        return result;
    }
}
