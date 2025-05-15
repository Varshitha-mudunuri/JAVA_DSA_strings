import java.util.*;
public class reverseGroups {
    public static void main(String[] args){
       int[] arr={1,2,3,4,5,6,7,8};
  

   int k=3;
   int count=0;
   int[] temp=new int[arr.length];
   for(int i=0;i<arr.length;i+=k){
    int end=Math.min(i+k,arr.length);
    for(int j=end-1;j>=i;j--){
      temp[count++]=arr[j];

    }
   }

    for(int i=0;i<arr.length;i++){
        System.out.println(temp[i]);
    } 



    }
}
