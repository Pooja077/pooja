package Codeketa;

import java.util.Scanner;

public class Numeric {

	public static void main(String[] args) {
	
	String s;
	
	Scanner sc=new Scanner(System.in);
	int count = 0;
		s=sc.nextLine();
for(int i=s.length()-1;i>0;i--){
	char c=s.charAt(i);

if(c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0'){
	count++;
}
}if(count>0){
System.out.println("true");
	} 
else{
	System.out.println("false");
}
}

//System.out.println("false");
}