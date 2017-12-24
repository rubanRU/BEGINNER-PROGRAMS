import java.util.*;
import java.lang.*;
public class meg1{
     public static void main(String aa[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
       Arrays.sort(a);
       int y=n/2;
       for(int i=0;i<n;i++){
           if(i==y){
               System.out.println(a[i]);
           }
       }

      
}
}
