public class addOneToLast {
    public static void main(String[] args){
        int[] arr={9,6,9,8};
        int count=arr.length-1;
        boolean allNine=true;
        
            if(arr[count]<9){
                arr[count]=arr[count]+1;
                allNine=false;
            }else{
            for(int i=count;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
            }
            else{ 
                arr[i]=arr[i]+1;
                allNine=false;
                break;
               }
            
            }
        }

        if(allNine){
            System.out.print(1);
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
