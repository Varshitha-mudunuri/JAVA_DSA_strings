public class findMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr={3,1,3};
        int missing=-1;
        int repeated=-1;

        int[] freq=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
         for(int i=1;i<=arr.length;i++){
           if(freq[i]==0){
            missing=i;
           }
           else if(freq[i]==2){
            repeated=i;
           }
        }




        System.out.println(missing);
        System.out.println(repeated);

    }
}
