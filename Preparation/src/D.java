class D
{
	public static void main(String ar[])
	{
		final String summ= new String("hii");
		summ.concat("hiii");
		summ.concat("ietiet");
		System.out.println(summ.toString());
		final D gg=new D();
		Normal n=new Normal();
		SummaInterface s= new Normal();
		SummaInterface.interfaceStaticMethod();
//		SummaInterface.i=10;
        Integer i1 = 127;
        
        Integer i2 = 127;
        
 
        System.out.println(i1 == i2);
 
        Integer i3 = 128;
 
        Integer i4 = 128;
 
        System.out.println(i3 == i4);
		if(s.i==19)
		{
			
		}
		System.out.println(s.i);
		Thappu t= new Thappu();
		t.j=9;
		System.out.println("Final Class variable"+t.j);
		 try
	        {
	            methodWithThrows();
	        }
	        catch(NumberFormatException ex)
	        {
	            System.out.println("This block can handle all types of exceptions"+ex);
	        }
		 Thappu t1=new Thappu();
		 t1=null;
		 System.gc();
		
	}
	 protected void finalize()
	{
		System.out.println("Garbage Collection");
	}
	static void methodWithThrows() throws NumberFormatException, NullPointerException
    {
		try{
	        int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
	 
	        String s = null;
	 
	        System.out.println(s.length());    //This statement throws NullPointerException
		}
		catch(Exception e)
		{
			System.out.println(e);
			throw new NumberFormatException();
			
		}
    }
}
interface SummaInterface 
{
	  int i=1;
	 void interfaceMethod();
	public void interfaceMethod1();
	static void interfaceStaticMethod() {
		System.out.println("Static method inside the interface");
	}
}
abstract class SummaAbstract implements SummaInterface
{
	public SummaAbstract() {
		System.out.println("Summa Abstract Constructor");
	}
		
	public void normalMethodInAbstract()
	{
		System.out.println("normalMethodInAbstract");
	}
	public abstract void abstractMethodInAsbtract();
	static void staticAbstractMethod() {
		
	}
}
class Normal extends SummaAbstract
{

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void abstractMethodInAsbtract() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void interfaceMethod1() {
		// TODO Auto-generated method stub
		
	}
	
}
class Normal1 extends SummaAbstract
{

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceMethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractMethodInAsbtract() {
		// TODO Auto-generated method stub
		
	}
	
}

final  class Thappu extends D
{
	int j=10;
	static class InnerThappu
	{
		static final class InnerInnerThappu 
		{
			 class InnerInnerThappuOne
			{
				public  void thappuMethod() 
				{
					System.out.println("Ulla Irukken");
				}
			}
		}
	}
}