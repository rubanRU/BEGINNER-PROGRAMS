import java.util.*;
import java.lang.*;
public class index{
     public static void main(String aa[]){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
           
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d %d",a[i],i);
            System.out.println();
        }


      
}
}
