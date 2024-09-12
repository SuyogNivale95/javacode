package assignments;

import java.util.Scanner;

public class Assignment16 
{
	
	static double pi=3.14;
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int r;
		System.out.println("The value of pi is " + pi);
		System.out.println("The value of r is ");
		r=s1.nextInt();
		System.out.println("Circumference og circle " + 2*pi*r);
	}
}
