 
import java.util.*;
import java.lang.*;
class MarksOutOfBounds extends Exception
{
    MarksOutOfBounds(String msg)
    {
        super(msg);
   }
}
class Student
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of marks you want to enter.");
        int x=s.nextInt();
        int arr[]=new int[x];
        System.out.println("Enter the marks.");
        try
        {
            for(int i=0;i<x;i++)
            {   
                arr[i]=s.nextInt();
                if(arr[i]>100)
                    throw new MarksOutOfBounds("Error :: Greater than 100.");
            }
        }
        catch(MarksOutOfBounds e)
        {
            System.out.println(e);
        }
    }
}