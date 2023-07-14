package Arithmetic;
import java.util.Scanner;
interface operation1
{
	public void display(int a,int b);	
}
public class Add implements operation1
{
	
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println("addition:"+c);
	}
}