import java.util.Scanner;
class Sort
{
	String temp;
	Scanner sc=new Scanner(System.in);
	void sort()
{
	String []a1=new String[10];
	System.out.println("enter name of subject:");
	for(int i=0;i<5;i++)
	{
		a1[i]=sc.next();
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(a1[j].compareTo(a1[i])>0)
			{
				temp=a1[i];
				a1[i]=a1[j];
				a1[j]=temp;
			}
		}
	}
	System.out.println("sorted");
	for(int i=0;i<5;i++)
	{
		System.out.println(a1[i]+" ");
	}
}}
class Main9
{
	public static void main(String args[]){
		Sort s1=new Sort();
		s1.sort();
}}