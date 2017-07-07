package lenn;
import java.util.Scanner;
public class AlphabetOrNoT {
	public static void main(String args[]){
		char ch;
		System.out.println("enter a character");
		Scanner n=new Scanner(System.in);
		ch=n.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
			System.out.println("character is alphabet");}
			else
				{System.out.println("character is not an alphabet");}
		}
	}

