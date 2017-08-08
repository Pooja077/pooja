package sunday;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;

public class Char {
	public static void main(String args[]) throws IOException{
		int characters=0;
		int numbers=0;
		int alphanumeric=0;
		char ch;
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the input");
		String s=br.readLine();
		
			
			for(int j=0;j<s.length();j++){
			ch=s.charAt(j);
			if(Character.isAlphabetic(ch)){
				characters++;
			}
			else if(Character.isDigit(ch)){
				numbers++;
			}
			else{
				alphanumeric++;
			}
		}
			System.out.println("chars"+characters);
			System.out.println("nums"+numbers);
			System.out.println("alphanumerics"+alphanumeric);
			
	}

	
	
		
}
