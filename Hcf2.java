package hcf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hcf2 {
    public static void main(String args[]) throws IOException
    {
 	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	   System.out.println("enter a number");
 	   int n1=Integer.parseInt(br.readLine());
 	   System.out.println("enter a number");
 	   int n2=Integer.parseInt(br.readLine());
 	   int hcf=0;
 	   int min=Math.min(n1,n2);
 	   for(int i=min;i>=1;i--){
 		   if(n1%i==0 && n2%i==0){
 			   hcf=i;
 			   break;
 		   }
 	   }
 	   System.out.println(n1+","+n2+"="+hcf);
    }

}
