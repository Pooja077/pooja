package lenn;
import java.util.*;
public class PowerOfaNo {
public static void main(String args[]){
	int number;
	int power;
	System.out.println("enter the number and power");
	Scanner n=new Scanner(System.in);
	number=n.nextInt();
	power=n.nextInt();
	int ans=(int) Math.pow(number, power);
	System.out.println(ans);
}
}
