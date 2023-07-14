import java.util.Scanner;
class Negativenumber extends Exception
{
	Negativenumber(String s)
	{
		super(s);
	}
}
class Average
{	int sum;
	void find(int a)throws Exception 
	{
		if(a<0)
		{
			throw new 	Negativenumber("exception");
	}	}
}
class Main13
{
	public static void main(String args[])
	{
		int sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter the limit:");
			int n=sc.nextInt();
			Average a1=new Average();
			a1.find(n);
			for(int i=1;i<=n;i++)
			{
				sum+=i;
			}
			System.out.println("sum:"+sum);
			avg=sum/n;
			System.out.println("average is:"+avg);
		}
		catch(Exception e)
		{
			System.out.println("Exception----"+e);
		}
	}
}