import java.util.*;
public class waveSort {
    public static void main(String[] args){
        int[] arr={20,1,8,6,9,2};
        for(int j=0;j<arr.length-1;j++)
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        for(int i=0;i<arr.length-1;i+=2){
            
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            
        }




        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
