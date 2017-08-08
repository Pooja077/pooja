package sunday;

public class Oddn {
public static void main(String args[]){
	int n=15;
	int sum=0;
	int odd_sum=0;
	for(int i=0;i<=15;i++)
{
  	sum+=i;	
}
	for(int j=15;j<=45;j++){
		int odd=j%2;
		if(odd!=0){
			odd_sum+=j;
		}
	}
	System.out.println("sum of 15 nums is: "+sum);
    System.out.println("sum od odd numbers is: "+odd_sum);
    }
}
