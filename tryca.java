import java.util.*;
class tryca
{
    void main()
    {
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        try
        {
        System.out.println("Please  enter the first no.");
        a=s.nextInt();
        System.out.println("Please  enter the second no.");
        b=s.nextInt();
        c=a/b;
        System.out.println(c);
    }
    catch(InputMismatchException e)
    {
        System.out.println("Please enter integer no. only");
    }
   catch(Exception e)
    {
        System.out.print ("Please do not divide the no. by Zero");
    }
    finally
    {
        System.out.println("Please enter the number again");
    }
    }
}