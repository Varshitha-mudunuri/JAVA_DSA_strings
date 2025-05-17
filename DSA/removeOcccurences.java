public class removeOcccurences {
    public static void main(String[] args){
        int[] arr={1,2,3,3,2,5,3,3};
        int ele=3;
       /* 
    //   it count non ele(3) ocuurences and print
       
       int count=0;
        int n=arr.length;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==ele){
            count++;
           }
       }
       int result=n-count;
       System.out.println(result);
 */
// removes given element occurences and order remaining elements and count them
       int k=0;
      for(int i=0;i<arr.length;i++){
           if(arr[i]!=ele){
            arr[k]=arr[i];
            k++;
           }
      }
       System.out.println(k);    

    





    }
}
