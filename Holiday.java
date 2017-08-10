package guvi;

import java.util.Scanner;

public class Holiday {
public static void main(String args[]){
	String s;
	System.out.println("ENTER THE DAY");
	Scanner n=new Scanner(System.in);
	s=n.nextLine();
	
    if(s.equalsIgnoreCase("sunday") || s.equalsIgnoreCase("saturday")){
    	System.out.println("false");}
    else{
    	
    		System.out.println("true");}

}
}
