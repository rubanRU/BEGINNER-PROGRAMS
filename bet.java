import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class bet {
     public static void main(String aa[]){
         int a;
         int f=0;
         int b,c;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    for(int i=b;i<=c;i++){
        if(i==a){
            f=1;
            break;
        }
    }
   if(f==1){
       System.out.println("Yes");
   }
 else{
        System.out.println("NO");
 }


  
