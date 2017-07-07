package lenn;
import java.util.Scanner;
public class ArmStrong {
	public static void main(String args[]){
		int ans=0;
		int a;
		int b;
		int k;
		Scanner n=new Scanner(System.in);
		k=n.nextInt();
		b=k;
		while(k>0){
			a=k%10;
			k=k/10;
			ans=ans+(a*a*a);}
		if(b==ans){
			System.out.println("armstrong number");}
		else{
			System.out.println("not an armstrong number");
					
		}
	}

}
