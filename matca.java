import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class matca{
    public static void main(String aa[]){
    int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    char c[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    Scanner s=new Scanner(System.in);
    int g=s.nextInt();
    for(int i=0;i<a.length;i++){
        if(a[i]==g){
            System.out.println(c[i]);
            break;
        }
    }
           
   }
}

