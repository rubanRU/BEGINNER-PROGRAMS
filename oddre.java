import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class oddre{
    public static void main(String aa[]){
   
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int count=1;
    int k=s.nextInt();
   for(int i=0;i<=a;i++){
       if(i%2!=0){
            if(count==k){
               System.out.print(i);

           }
            count++;
       }

}
}
}

