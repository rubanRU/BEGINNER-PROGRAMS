import java.util.*;
import java.lang.*;
public class sort{
      public static void main(String aa[]){
       int n;
       int count=0;
       int c;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
       }
      Arrays.sort(a);
      for(int i=0;i<n;i++){
          System.out.printf("%d ",a[i]);
      }
       
      
}
}
