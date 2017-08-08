package sunday;

import java.util.Scanner;

public class Num {
public static void main(String args[]){
	int n;
	int ans=0;
	System.out.println("enter a number");
	Scanner x=new Scanner(System.in);
	n=x.nextInt();
	for(int i=0;i<=n;i++){
		ans += i;
	}
	System.out.println(ans);
}
}
