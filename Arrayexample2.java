package Day6;

import java.util.Scanner;

//wap to ask 10 numbers from user and display  numbers and their sum 
public class Arrayexample2 {

	public static void main(String[] args) {
		
		int n[]= new int[5];
		int sum=0;
		Scanner s= new Scanner(System.in);
				
		for(int i=0;i<5;i++)
		{
		System.out.println("enter number");
		n[i]= s.nextInt();
		}
		for(int i=n.length-1;i>=0;i--)
		{
		System.out.print("  "+ n[i]);
		sum =sum+n[i];
	    }
		System.out.println("sum= "+sum);

}}
