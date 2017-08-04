package hcf;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
		int x;
		System.out.println("enter a number");
		Scanner n=new Scanner(System.in);
        x=n.nextInt();
        while(x!=0){
        int q=x%10;
        System.out.print(q);
        x=x/10;
        }
	}

}
