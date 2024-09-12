package assignments;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int l;
		int b;
		System.out.println("Enter the value of Lenght ");
		l=s1.nextInt();
		System.out.println("Enter the value of B ");
		b=s1.nextInt();
		System.out.println("Area of Rectangle = " +l*b);
	}
}
