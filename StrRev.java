package Codeketa;
import java.util.Scanner;
public class StrRev {

public static void main(String args[]){
	String s;
	String t;
	System.out.println("enter a word");
	Scanner n=new Scanner(System.in);
	s=n.nextLine();
	int len=s.length();
	
	for(int i=len-1;i>=0;i--){
		char ch=s.charAt(i);
		
            t=""+ch+"";
            System.out.print(t);}
	for(int i=len-1;i>=0;i--){
		char ch=s.charAt(i);
		
            t=""+ch+"";
            System.out.println("");  
	        System.out.print(t.replaceAll("[aeiouAEIOU]", ""));}
	}
	
 
}
