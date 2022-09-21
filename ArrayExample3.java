package Day6;

import java.util.Scanner;


//Q wap to ask 7 names from user and print them 
//Q wap to ask length of string array from user and perform action 
public class ArrayExample3 {

	public static void main(String[] args) {
		
	//	String name[]= new String[7];
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter number of records you want to store in array");
		int size=s.nextInt();
		
		String name[]= new String[size];
	
		for(int i=0;i<size;i++)
		{
			System.out.print("enter name");
			name[i]=s.next();
		}
		for(int i=0;i<size;i++)
		{
		  System.out.print(" "+name[i]);
		}
		
		
		
	}

}
