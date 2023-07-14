package Arithmetic;
import java.util.Scanner;
interface operation4
{
	public void display(int a,int b);	
}
public class Div implements operation4
{
	
	public void display(int a,int b)
	{
		int c=a/b;
		System.out.println("division:"+c);
	}
}