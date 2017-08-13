package guvi;

import java.util.Scanner;

public class Rot {
public static void main(String args[])
{
	
int[] n={3,5,2,5,2,6,7,9};
int k=2;
for(int i=0;i<k;i++){
for(int j=n.length-1;j>0;j--){
	int temp=n[j];
	n[j]=n[j-1];
	n[j-1]=temp;
	
}}
for(int j=0;j<n.length;j++){
	System.out.println(n[j]);
}}}