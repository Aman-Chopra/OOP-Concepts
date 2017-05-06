package lab7que4;
import java.util.*;
import java.lang.*;
class excepts extends Exception
{
    excepts(String msg)
    {
        super(msg);
    }    
}
class Lab7que4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        System.out.println("Eneter the dimensions of the array.");
        int m=s.nextInt();
        int n=s.nextInt();
        try
        {
            if(m!=n)
            throw new excepts("Not a square matrix.");
            else
            System.out.println("Square Matrix.");
        }
        catch(excepts e)
        {
            System.out.println(e);
        }
    }
}