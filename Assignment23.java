package assignments;

public class Assignment23 
{
	final static double pi=Math.PI;
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
			double r=Math.random();
			System.out.println("The value of r is = " + r);
			double area=pi*r*r;
			System.out.println("The Area of Circle is = " + area);
		}
	}
}
