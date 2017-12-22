import java.util.*;
import java.lang.*;
public class repeat{
      public static void main(String aa[]){
           int n,p,q;
           int f;
           int sum=0;
           Scanner s=new Scanner(System.in);
           p =s.nextInt();
           n = s.nextInt();
           for(int i=p;i<=n;i++){
                f=i;
               int m=i;
           while(m>0){
               q=m%10;
               sum=sum+q*q*q;
               m=m/10;
           }
           if(f==sum){
               System.out.printf("%d ",i);
           }
               sum=0;

          }
}
}
