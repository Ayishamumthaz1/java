import java.util.Scanner;
class Main6
{
	public static void main(String args[])
	{
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		n=sc.nextInt();
		System.out.println("enter number of coloumns:");
		m=sc.nextInt();
		int[][]m1=new int[n][m];
		int[][]m2=new int[n][m];
		int[][]m3=new int[n][m];
		System.out.println("enter values in first matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter values in second matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("sum of two matrices:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println("sum of two matrices:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(m3[i][j]+"  ");
			}
		}
	}
}
				
			
		
