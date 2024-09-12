package assignments;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int L;
		int B;
		System.out.println("The value of L is ");
		L=s1.nextInt();
		System.out.println("The value of B is ");
		B=s1.nextInt();
		System.out.println("Circumference of Rectangle is = " + 2*(L+B));
	}
}
