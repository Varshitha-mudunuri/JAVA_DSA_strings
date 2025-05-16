import java.util.*;

public class stock_buy_sell {
    public static void main(String[] args){
    int[] arr={3,5,7,8,1,6,8,9};

/* ------one pass approach(best)-------------------
<<<< find min,then iterate from right of min and subtract each to get max profit >>>>
   
   
   int min=arr[0];
    int maxProf=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }

       
        int profit=0;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>min){
                profit=arr[j]-min;
            }
            maxProf=Math.max(maxProf,profit);
        }
    } 
        System.out.println(maxProf);
 
    
    
    */

// <<<<<<<<<------------find min,from min to right find max, sub max-min----->>>>>>
    int min=arr[0];
    int minindex=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
            minindex=i;
        }
    }
        int max=min;
        for(int j=minindex+1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }

        }
           
    System.out.println(max-min);

// <<<<<<-------------using selection sort logic(brute force)------------------------>>>>
/* 
     int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i]; // buy at i, sell at j
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);


 */

}
}
