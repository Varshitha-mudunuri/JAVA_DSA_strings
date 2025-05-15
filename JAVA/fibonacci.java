import java.io.*;
class fibonacci{
   static void fibo(int count){
        int n1=0;
        int n2=1;
        for(int i=0;i<count;i++){
           System.out.println(" "+n1);
          int n3=n2+n1;
          
           
           n1=n2;
           n2=n3;
        }
     }
     public static void main(String[] args){
     
     fibo(10);

    }
}