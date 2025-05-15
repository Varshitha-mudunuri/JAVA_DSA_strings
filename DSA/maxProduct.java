import java.util.*;
public class maxProduct {
    public static void main(String[] args){
    int[] arr={-10,-3,-5,-6,-20};
     int maxpro=Integer.MIN_VALUE;
    for(int i=0;i<arr.length-2;i++){
        for(int j=i+1;j<arr.length-1;j++){
            for(int k=j+1;k<arr.length;k++){
               maxpro= Math.max(maxpro,arr[i]*arr[j]*arr[k]);
            }
        }
    }

    System.out.println(maxpro);  

/*---------------------------using 3rd largest-------------------
 int big=arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
          }
          int secbig=arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]>secbig && arr[i]!=big){
                secbig=arr[i];
            }
          }
          int thirdbig=arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]>thirdbig && arr[i]!=big){
              if( arr[i]!=secbig){
                thirdbig=arr[i];
              }
            }
          }

        System.out.println(big*secbig*thirdbig);

*/

/* -----------using sort-------------- 

int n=arr.length;
 for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr.length-1;j++){
    if(arr[j]>arr[j+1]){
      int temp=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
    }
  }

}

System.out.println(arr[n-1]*arr[n-2]*arr[n-3]);

*/

}
}
