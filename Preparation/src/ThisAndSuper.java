
public class ThisAndSuper 
{
	public static void maibn(String ar[])
	{
		Dappa d = new Dappa();
		d.methodOne();
	}
}
class summa
{
	int i=10;
	public void method()
	{
		int i=9;
		System.out.println("Called by super keyword from SubClass");
	}
	final void finalMethod()
	{
		
	}
	void finalMethod(int i) {
		
	}
	
}

class Dappa extends summa
{
	final static  int i;
	static {
		i=10;
	}
//	Dappa()
//	{
//		i=12;
//	}
	void finalMethod(int j)
	{
		
	}
	public void methodOne()
	{
		System.out.println("Dappa Method One");
		this.methodTwo();
		super.method();
	}
	public static void methodTwo()
	{
		System.out.println("Dappa Method two");
	}
	public void method()
	{
		
	}
}