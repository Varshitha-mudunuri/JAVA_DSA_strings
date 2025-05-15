public class reverseArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};


      /* -----------------using temp[] array-----------------
      
      int[] rev=new int[arr.length];
        int count=0;
          for(int j=arr.length-1; j>=0;j--){
             rev[count++]=arr[j];
          }

           for(int i=0;i<rev.length;i++){
            System.out.println(rev[i]);
        }




 */ 

//  -----------without using temp[]---------------
      int n=arr.length;
      for(int i=0;i<n/2;i++){
        int temp=arr[n-1-i];
        arr[n-1-i]=arr[i];
        arr[i]=temp;

      }
 
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
