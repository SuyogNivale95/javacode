package assignments;

public class Assignment8 
{
	static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of a & b is " + sum);
	}
	void multipliction()   // not static method with non parameterized
	{
		int k=10, n=20;
		System.out.println("Multiplication of k and n is " + k*n);
	}
	public static void main(String[] args) 
	{
		add(10,25);
		Assignment8 obj=new Assignment8();
		obj.multipliction();
	}
}
