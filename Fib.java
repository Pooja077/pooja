package lenn;
import java.util.Scanner;
public class Fib {
	public static void main(String args[]){
	int n1=0;
	int n2=1;
	int count;
	
	System.out.println("enter the value of n");
	Scanner n=new Scanner(System.in);
	count=n.nextInt();
	System.out.println(n1);
	System.out.println(n2);
	for(int i=0;i<count;i++){
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	
		
		
	}
	

}
