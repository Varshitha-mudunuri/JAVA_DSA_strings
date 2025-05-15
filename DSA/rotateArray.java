 public class rotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int d=2;

// ---------------using temp[]-------------

        int count=0;
       int n=arr.length;
       int[] temp=new int[arr.length];
        for(int j=d;j<arr.length;j++){
        temp[count++]=arr[j];
       }
       for(int i=0;i<d;i++){
        temp[count++]=arr[i];
       }
      
        


   for(int i=0;i<temp.length;i++){
    System.out.println(temp[i]);
   }



/* --------------without using temp[]------------


        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];

                
            }
            arr[arr.length-1]=temp;
        }

         for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
         }  */
    }
}

