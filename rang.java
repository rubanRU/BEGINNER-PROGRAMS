import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class rang{
     public static void main(String aa[]){
     int a,f=0;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     for(int i=1;i<=10;i++){
         if(i==a){
             f=1;
             break;
         }
     }
     if(f==1){
         System.out.println("Yes");
     }
 else{
      System.out.println("No");
         }
    
     

    }
}
