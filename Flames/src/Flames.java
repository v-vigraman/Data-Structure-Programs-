import java.util.ArrayList;
import java.util.Scanner;

public class Flames 
{
	public static void main(String ar[])
	{
		String n1,n2;
		String []f= {"Friends","Love","Affection","Marriage","Enemy","Sister"};
		Scanner sc=new Scanner(System.in);
		n1=sc.nextLine();
		n2=sc.nextLine();
		System.out.println(n1+" "+n2);
		for(int i=0;i<n1.length();i++)
		{
			String ch=Character.toString(n1.charAt(i));
			if(n2.contains(ch))
			{
				n2=n2.replaceFirst(ch,"*");
				n1=n1.replaceFirst(ch, "*");
			}
		}
		System.out.println(n1+" "+n2);
		String nw=n1.concat(n2);
		int count=0;
		for(int i=0;i<nw.length();i++)
		{
			if(nw.charAt(i)!='*')
			{
				count++;
			}
		}
		int len=6,i=1,j=0,flag=0;
		StringBuilder flm=new StringBuilder("flames");
		while(len!=1)
		{
			for(int z=0;z<=5;z++)
			{
				if((flm.charAt(z)!='*')&&(i==count))
				{
					System.out.println(flm);
					flag=1;
					flm.setCharAt(z, '*');
					len--;
					i=1;
				}
				if(flm.charAt(z)=='*')
				{
					continue;
				}
				i++;
			}
		}
		for(int k=0;i<flm.length();k++)
		{
			if(flm.charAt(k)!='*')
			{
				System.out.println(f[k]);
				break;
			}
		}
		
	}
}
