import java.util.Scanner;
class Age extends Exception
{
	Age(String m)
	{
		super(m);
	}
}
class validation
{
 	void validate(int age)throws Age
	{
		
		
		if(age>18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			throw new Age("invlid");
		}
	}
}
class Main12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter age");
			int age=sc.nextInt();
			validation v1=new validation();
			v1.validate(age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}