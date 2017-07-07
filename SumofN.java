package lenn;
import java.util.Scanner;
public class SumofN {
	public static void main(String args[]){
		int x;
		int sum=0;
		System.out.println("enter the number");
		Scanner n=new Scanner(System.in);
		x=n.nextInt();
		for(int i=0;i<=x;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
