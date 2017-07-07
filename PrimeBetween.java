package lenn;
import java.util.Scanner;
public class PrimeBetween {
public static void main(String args[]){
	int a;
	int b;
	int c;
	int x=0;
	System.out.println("enter the limit values");
	Scanner n=new Scanner(System.in);
	a=n.nextInt();
	b=n.nextInt();
	
	for(int i=a;i<=b;i++){
		for(int j=2;j<i;j++){
			if(i%j==0){
				x=0;
				break;
			}
			else{
				x=1;
			}
		}
		if(x==1){
			System.out.println(i);
		}
	}
}
}
