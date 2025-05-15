import java.util.*;
public class maxConsOnes {
   public static void main(String[] args) {
       int arr[] = {1, 1, 0, 0, 1, 0, 1, 0,  1, 1, 1};
       int count=0;
       int maxcons=0;

        for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            count=0;
        }
        else{
            count++;
        }
        
       }
        maxcons=Math.max(count,maxcons);
        System.out.println(maxcons);
   } 
}
