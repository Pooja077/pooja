package lenn;
import java.util.Scanner;
public class Prime {
public static void main(String args[]){
	int i,n;int x=0;
	System.out.println("enter the value : ");
	Scanner c=new Scanner(System.in);
	n=c.nextInt();
	for(i=2;i<=(n/2);++i)
	{
		if(n%i==0)
		{ x=1;
		break;
		}}
		if(x==0)
		{System.out.println("its a prime no.");}
		else
		{System.out.println("its not a prime no.");}
		
		}
	}
	
	