package assignments;

import java.util.Scanner;

public class Assignment15
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int l1;
		int l2;
		int h;
		System.out.println("Enter the value of l1 ");
		l1=s1.nextInt();
		System.out.println("Enter the value of l2 ");
		l2=s1.nextInt();
		System.out.println("Enter the value of h ");
		h=s1.nextInt();
		System.out.println("Area of Trapezium = " + 0.5*(l1+l2)*h);
	}
}
