import java.util.Scanner;

public class MinPath 
{
	static int n;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[][]=new int[n][n];
		int dup[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				dup[i][j]=0;
				a[i][j]=sc.nextInt();
			}
		}
		int brk=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==1)
				{
					dup[i][j]=1;
					findMinPath(a,i,j,dup);
					brk=1;
				}
			}
			if(brk==1)
			{
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(dup[i][j]==1)
				{
					System.out.print("("+i+","+j+")->");
				}
			}
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(dup[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void findMinPath(int a[][],int x,int y,int dup[][])
	{
		System.out.println("X="+x+"Y="+y);
		if(x!=n-1 && a[x+1][y]==1 && dup[x+1][y]!=1)
		{
			dup[x+1][y]=1;
			findMinPath(a, x+1, y, dup);
		}
		if(y!=n-1 && a[x][y+1]==1 && dup[x][y+1]!=1)
		{
			dup[x][y+1]=1;
			findMinPath(a, x, y+1, dup);
		}
//		if(x==n-1 && y==n-1)
//		{
//			return;
//		}
//		if(x!=n-1 && y!=n-1 && a[x+1][y+1]==1 && dup[x+1][y+1]!=1)
//		{
//			dup[x+1][y+1]=1;
//			findMinPath(a, x+1, y+1, dup);
//		}
//		if(x!=n-1 && y!=0 && a[x+1][y-1]==1 && dup[x+1][y-1]!=1)
//		{
//			dup[x+1][y-1]=1;
//			findMinPath(a, x+1, y-1, dup);
//		}
//		if(y!=0 && a[x][y-1]==1 && dup[x][y-1]!=1)
//		{
//			dup[x][y-1]=1;
//			findMinPath(a, x, y-1, dup);
//		}
	}
}
