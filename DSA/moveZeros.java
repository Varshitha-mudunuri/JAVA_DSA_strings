public class moveZeros {
    public static void main(String[] args) {
     
     int arr[]={1, 2, 0, 4, 3, 0, 5, 0};   
    
    
    // ------------using temp array------------------ 
    
    
    
    // int temp[]={0,0,0,0,0,0,0,0}; 
    int temp[]=new int[arr.length];
      for(int j=0;j<arr.length;j++){
        temp[j]=0;
      }

     int count=0;   
     for(int i=0;i<arr.length;i++){
        if(arr[i] != 0){
            temp[count]=arr[i];
             count++;
        }
     
    }
     for(int i=0;i<arr.length;i++){
        System.out.println(temp[i]);
     }
        
     


    /* ------------without using temp[]---------------------*/


/* 
     int count=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[count++]=arr[i];
      }
     
     }

    for(int i=count;i<arr.length;i++){
        
            arr[i]=0;
        }

    for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
    }
 */


    }
}
