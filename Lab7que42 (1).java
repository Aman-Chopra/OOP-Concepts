package lab7que42;
import java.util.*;
import java.lang.*;
class excepts extends Exception
{
    
    excepts(String msg)
    {
        super(msg);
    }
}
class Lab7que42
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the number.");
        int x=s.nextInt();
        try
        {   if(x<0)
            throw new excepts("Error :: Neagtive number entered.");
            else
            System.out.println("Square root = "+Math.sqrt(x));
            
        }
        catch(excepts e)
        {
            System.out.println(e);
        }        
    }
}