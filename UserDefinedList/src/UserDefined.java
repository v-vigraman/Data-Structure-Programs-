import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class sample
{
}
public class UserDefined {
	public static void main(String ar[]) {
		sample s=new sample();
		List<Student> arr = new ArrayList<Student>();
		Student s1=new Student(65, 6);
		s1=new Student(65, 6);
		arr.add(s1);
		s1=new Student(65, 6);
		arr.add(s1);
		s1=new Student(65, 6);
		arr.add(s1);
		s1= new Student(55, 5);
		arr.add(s1);
		arr.add(new Student(50, 1));
		arr.add(new Student(55, 3));
		arr.add(new Student(54, 2));
		arr.add(new Student(53, 5));
		arr.add(new Student(52, 4));
		arr.add(s);
		Collections.sort(arr,(s1,s2)->{
			return s1.mark>s2.mark?-1:s1.mark<s2.mark?1:0;
		});
		for(Student s:arr)
		{
			System.out.println(s);
		}
	}
}
class Student {
	int mark, roll;

	public Student(int mark, int roll) {
//		super();
		this.mark = mark;
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", roll=" + roll + "]";
	}
}