

public class thirdLarge {
    public static void main(String[] args){
        int arr[]={5,8,9,7,10};
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
          int thirdbig=-1;
          for(int i=0;i<arr.length;i++){
            if(arr[i]>thirdbig && arr[i]!=big){
              if( arr[i]!=secbig){
                thirdbig=arr[i];
              }
            }
          }

        System.out.println(thirdbig);
     


     /*-----------------------using sorting---------------------- 
     
     for(int i=0;i<arr.length;i++){
  for(int j=0;j<arr.length-1;j++){
    if(arr[j]>arr[j+1]){
      int temp=arr[j];
      arr[j]=arr[j+1];
      arr[j+1]=temp;
    }
  }

}
for(int i=arr.length-1;i>=0;i--){
   if(arr[i]!=arr[arr.length-1] && arr[i]!=arr[arr.length-2]){
      System.out.println(arr[i]);
      break;
   }
   
 }

*/








        
    }
}
