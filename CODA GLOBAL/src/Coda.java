import java.lang.*;
import java.util.*;
class Coda
{
    public static void main(String ar[])
    {
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int elements[]=new int[numberOfElements];
        for(int i=0;i<numberOfElements;i++)
        {
            elements[i]=input.nextInt();
        }
        int findElement = input.nextInt();
        int check=0;
        for(int i=0;i<numberOfElements;i++)
        {
            if(findElement == elements[i])
            {
                System.out.print(i+" ");
                check=1;
                break;
            }
        }
        
        for(int i=numberOfElements-1;i>=0;i--)
        {
            if(findElement==elements[i])
            {
                System.out.print(i);
                check=1;
                break;
            }
        }
        if(check!=1)
        {
            System.out.print("NO OCCURENCES");
        }
        
    }
}