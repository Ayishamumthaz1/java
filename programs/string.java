import java.util.Scanner;
class Main11
{
	public static void main(String args[])
	{char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println(s.length());
		char []a1=new char[20];
		a1=s.toCharArray();
		System.out.println("sorted order");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				if(a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.println(a1[i]);
		}
	}
}