package lenn;
import java.util.Scanner;
public class Fact {
	public static void main(String args[]){
	int x;
	int y=1;
	System.out.println("enter the number");
	Scanner n=new Scanner(System.in);
	x=n.nextInt();
	for(int i=1;i<=x;i++){
	y=y*i;	
	}
System.out.println(y);
}}
