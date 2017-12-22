import java.util.*;
import java.lang.*;
public class arml{
      public static void main(String aa[]){
           int n,p;
           int f;
           int sum=0;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           f=n;
           while(n>0){
               p=n%10;
               sum=sum+p*p*p;
               n=n/10;
           }
           if(f==sum){
               System.out.println("YES");
           }
        else{
               System.out.println("NO");
            }
}
}
