import java.util.*;
public class sumsq {
    public static void main(String aa[]){
        Scanner s=new Scanner(System.in);
        int sum=0;
        String h=s.next();
        for(int i=0;i<h.length();i++){
           int u= Character.getNumericValue(h.charAt(i));
           sum=sum+u*u;
        }
        System.out.println(sum);
        
    }
        }
