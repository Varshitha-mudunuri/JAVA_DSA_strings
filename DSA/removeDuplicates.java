import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args){
     /* ------using hashset-------------
     
     int arr[]={2,2,3,4,2,6,2};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);

            }
        }
        System.out.println(set);

         */



int[] arr = {1, 2, 2, 3, 1, 4, 5, 3};
int n = arr.length;
int[] temp = new int[n];
int count = 0;

for (int i = 0; i < n; i++) {
    boolean isDuplicate = false;
    for (int j = 0; j < count; j++) {
        if (arr[i] == temp[j]) {
            isDuplicate = true;
            break;
        }
    }
    if (!isDuplicate) {
        temp[count++] = arr[i];
    }
}

// Print unique elements
for (int i = 0; i < count; i++) {
    System.out.print(temp[i] + " ");
}




    }
}
