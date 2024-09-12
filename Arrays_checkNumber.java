package Array;

public class Arrays_checkNumber 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=45;
		rollno[1]=75;
		rollno[2]=25;
		rollno[3]=34;
		int notocheck=34;
		
		for(int i=0;i<4;i++)
		{
			if(notocheck==rollno[i])
			{
				System.out.println("The Given Number is = " +notocheck +" and it is part of the Array");
				System.out.println("The index of the 34 is "+i);
			}		
		}
	}
}
