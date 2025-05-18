public class rearrangeElementsBySign {
    public static void main(String[] args){
    int[] arr={1,2,3,-4,-1,4,6,-9};
    int idx1=0;
    int[] pos=new int[arr.length];
    int[] neg=new int[arr.length];
     int p = 0, n = 0;

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0) pos[p++] = num;
            else neg[n++] = num;
        }

        // Merge alternately
        int i = 0, pi = 0, ni = 0;
        while (pi < p && ni < n) {
            arr[i++] = pos[pi++];
            arr[i++] = neg[ni++];
        }

        // Add remaining
        while (pi < p) {
            arr[i++] = pos[pi++];
        }
        while (ni < n){
            arr[i++] = neg[ni++];
        }

    for(int k=0;k<arr.length;k++){
        System.out.println(arr[k]);
    }

}
}