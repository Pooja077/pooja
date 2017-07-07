package lenn;
import java.util.Scanner;
public class NoOfDigits {
public static void main(String args[]){
	String str;
	int count=0;
	int y;
	System.out.println("enter the number :");
    Scanner n=new Scanner(System.in);
    str=n.nextLine();
 
for(int i=0;i<str.length();i++)
{
 count++;
}
    System.out.println(count);
}
}