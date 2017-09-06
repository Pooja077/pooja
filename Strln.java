package Codeketa;

import java.util.Scanner;

public class Strln {
  public static void main(String args[]){
	  String s;
	  System.out.println("enter a string");
	  Scanner n=new Scanner(System.in);
	  s=n.nextLine();
	  System.out.println(s.substring(s.length()-2,s.length()));
  }
}
