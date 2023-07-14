package Arithmetic;
import java.util.Scanner;
interface operation2
{
	public void display(int a,int b);	
}
public class Sub implements operation2
{
	
	public void display(int a,int b)
	{
		int c=a-b;
		System.out.println("substraction:"+c);
	}
}