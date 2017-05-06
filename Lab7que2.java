 
import java.util.*;
import java.lang.*;
class Lab7que2
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("The size of the array is 5");
        System.out.println("Enter the number which you want to enter.");
        int x=s.nextInt();
        try
        {
            System.out.println("Enter the numbers.");
            for(int i=0;i<x;i++)
            {
                a[i]=s.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException E)
        {
            System.out.println("Overflow reached.");
        }
            
    }
}