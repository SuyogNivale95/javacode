package assignments;

public class Assignment9 
{
	void add(int q, int b)
	{
		int sum=q+b;
		System.out.println(sum);
	}
	void sub(int r, double s)
	{
		double sub=r-s;
		System.out.println(sub);
	}
	void mul(int s, long l)
	{
		long mul=s*l;
		System.out.println(mul);
	}
	static void addd(int e, int f)
	{
		int as=e+f;
		System.out.println(as);
	}
	static void subb(double t, double y)
	{
		double uo=t-y;
		System.out.println(uo);
	}
	static void muli(float g, float p)
	{
		float f=g*p;
		System.out.println(f);
	}
	Assignment9(int z)
	{
		System.out.println("Add");
	}
	Assignment9(float x)
	{
		System.out.println("Sun");
	}
	Assignment9(double z)
	{
		System.out.println("Mul");
	}
	public static void main(String[] args) 
	{
		Assignment9 s1=new Assignment9(10);
		Assignment9 s2=new Assignment9(3.22f);
		Assignment9 s3=new Assignment9(10.0);
		addd(10,20);
		subb(10,30);
		muli(1,2);
		Assignment9 as=new Assignment9(0);
		as.add(10, 20);
		as.sub(11, 10.2);
		as.mul(11, 120);
	}
}
