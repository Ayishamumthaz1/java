import java.util.Scanner;
class Main9
{
	public static void main(String args[])
	{
		int n,m,flag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows:");
		n=sc.nextInt();
		System.out.println("enter number of coloumns:");
		m=sc.nextInt();
		int[][]m1=new int[n][m];
		int[][]m2=new int[n][m];
		
		System.out.println("enter values in first matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println(m1[i][j]);
			}
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				m2[i][j]=m1[j][i];
			}
		}
			
		System.out.println("transpose of the matrix:");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(m1[i][j]==m2[i][j])
				{
					flag=1;
				}
				else
					flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("symmetric");
		}
		else
		{
			System.out.println("not symmetric");
		}
	}
}
		