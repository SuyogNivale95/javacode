package assignments;

import java.util.Scanner;

public class Assignment11 
{
	static double pi=3.14;
	public static void main(String[] args)
	{
		int r;
		Scanner s1=new Scanner(System.in);
		System.out.println("The value of pi is = "+ pi);
		System.out.println("Enter value of r");
		r=s1.nextInt();
		System.out.println("Area of Circle = " +pi*r*r);
	}
}
