package guvi;

import java.util.Scanner;

public class Factx {
public static void main(String args[]){
int n;
int fac=1;
System.out.println("enter the input");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++){
	fac*=i;
	
}
System.out.println(fac);
}
}
