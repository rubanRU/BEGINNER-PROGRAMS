import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class chec{
    public static void main(String aa[]){
   
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int k=s.nextInt();
    int b[]=new int[a];
    for(int i=0;i<b.length;i++){
        b[i]=s.nextInt();
    }
    for(int i=0;i<b.length;i++){
        if(b[i]==k){
            System.out.println("Yes");
            break;
        }
    }
           
   }
}

