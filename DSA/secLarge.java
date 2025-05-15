
public class secLarge{
    public static void main(String[] args){
        int arr[]={9,9,9};
        int big=arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
          }
          int secbig=-1;
          for(int i=0;i<arr.length;i++){
            if(arr[i]>secbig && arr[i]!=big){
                secbig=arr[i];
            }
          }
          System.out.println(secbig);




/* 
-------------------------using sorting technique------------

for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr.length-1;j++){
    if(arr[j]>arr[j+1]){
      int temp=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
    }
  }

}
for(int i=arr.length-2;i>=0;i--){
   if(arr[i]!=arr[arr.length-1]){
      System.out.println(arr[i]);
      break;
   }
   else{
    System.out.println("-1");
    break;
   }
}


    */

    }
}
