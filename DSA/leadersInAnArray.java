public class leadersInAnArray {
    public static void main(String[] args){
        int[] arr={9,2,9,10,1,2};
        int count=0;
        boolean leader=true;
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                   continue;
                }
                else{
                    leader=false;
                    break;
                    
                }
            }
            if(leader){
            temp[count++]=arr[i];  
            }  
          }
          for(int i=0;i<count;i++){
            System.out.println(temp[i]);
          }
    }
}
