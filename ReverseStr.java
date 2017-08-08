package sunday;

import java.util.Scanner;

public class ReverseStr {
public static void main(String args[]){
	String x="";
	System.out.println("enter a string");
	Scanner n=new Scanner(System.in);
	String str=n.nextLine();
	int len=str.length();
	for(int i=len-1;i>=0;i--){
		 x+=str.charAt(i);}
	
	System.out.println(x);

}
}
