import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Queue;
//Sorted an number based on last digit
public class ArrayList1 
{
	public static void main(String ar[])
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int i=10;
		arr.add(i);
		arr.add(10);
		arr.add(13);
		arr.add(64);
		arr.add(34);
		arr.add(54);
		arr.add(145);
//		Comparator<Integer> com=new Comparator<Integer>() {		
//			@Override
//			public int compare(Integer c1, Integer c2) {
//				if(c1%10<c2%10)
//				{
//					return 1;
//				}
//				else if(c1%10>c2%10)
//				{
//					return -1;
//				}
//				else if(c1%10==c2%10)
//				{
//					if(((c1/10)%10)<((c2/10)%10))
//					{
//						return 1;
//					}
//				}
//				return -1;
//			}
//		};
		Collections.sort(arr);
		for(i=arr.size()-1;i>=0;i--)
		{
			System.out.println(arr.get(i));
		}
		System.out.println(arr);
//		Collections.sort(arr, com);
		arr.forEach(System.out::println);
	}
}
