package lenn;
import java.util.Scanner;
public class NaturalNo {
	public static void main(String args[]){
	int sum=0;
	int x;
	System.out.println("enter the no.");
	Scanner n=new Scanner(System.in);
    x=n.nextInt();
	System.out.println("sum of natural numbers is : ");
     for(int i=0;i<=x;i++)
     {
    	sum=sum+i;
    	}
     System.out.println(sum);
}
}