package lenn;

import java.util.Scanner;

public class pos {
	public static void main(String args[])
	{
		int a;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a<0)
		{
			System.out.println("negative");
		}
		else if(a>0)
		{
			System.out.println("positive");
		}else
		{ System.out.println("zero");}
	}

}
