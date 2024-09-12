package Array;

public class Array3 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int [3];
		rollno[0]=45;
		rollno[1]=65;
		rollno[2]=55;
		
		String name[]=new String[3];
		name[0]="Suyog";
		name[1]="Mahesh";
		name[2]="Priyanka";
		
		for(int i=0;i<3;i++)
		{
			System.out.println("My name is = "+ name[i] +" and My roll no is = " + rollno[i]);
		}
	}
}
