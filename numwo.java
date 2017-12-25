import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class numwo{
     public static void main(String aa[]){
     int a[]={1,2,3,4,5,6,7,8,9,10};
     String c[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     
     for(int i=0;i<a.length;i++){
         if(a[i]==n){
             System.out.println(c[i]);
         }
     }

}
}
