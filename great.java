import java.util.*;
public class great{
      public static void main(String aa[]){
            int a,b,c;
            Scanner s=new Scanner(System.in);
             a=s.nextInt();
             b=s.nextInt();
             c=s.nextInt();
             if(a>b&&a>c){
                 System.out.printf("%d is greater",a);
          }
           else if(b>c){
                System.out.printf("%d is greater",b);
           }
            else{
                  System.out.printf("%d is greater",c);
            }
             
      }

}
