public class findSumUntilOneDigit {
    public static void main(String[] args){
        int[] arr={2,0,6,7,9};
        int sum=0;
        
        
        for (int i = 0; i < arr.length; i++) {
              sum+=arr[i];
   
        }
        
        while(sum>9){
            int temp=0;
            while(sum!=0){
             int rem=sum%10;
             temp+=rem;
              sum=sum/10;
            }
           sum=temp;
        }
       
    

        System.out.println(sum);
    }
}
