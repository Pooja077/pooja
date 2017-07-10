package lenn;
import java.util.*;
public class MultiplicationTable {
	public static void main(String args[]){
		int x;
		int y;
		System.out.println("enter muliplication values");
		Scanner n=new Scanner(System.in);
		x=n.nextInt();
		
		for(y=1;y<=10;y++)
		{
			int ans=x*y;
			System.out.println(y+"*"+x+"="+ans);
		}
	}

}
