import java.util.*;
public class Number {
    private double n;
    Number()
    {
        n=0;
    }
    Number(double d)
    {
        n=d;
    }
    boolean isZero()
    {
        if(n==0)
            return true;
        else
            return false;
    }
    boolean isOdd()
    {
        if(isDecimal()==true)
        return false;
        else if(n%2!=0)
            return true;
        else
            return false;
    }
    boolean isEven()
    {
        if(isDecimal()==true)
        return false;
        else if(n%2==0)
            return true;
        else
            return false;
    }
    boolean isPrime()
    {
        if(isDecimal()==true)
        return false;
        int flag=0;
        if(n==1)
            return false;
        else if(n==2)
            return true;
        else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    boolean isArmstrong()
    {
        if(isDecimal()==true)
        return false;
        int a=(int)n;
        int no=0;
        int co=0;
        int count=0;
        while(a!=0)
        {
            no=a%10;
            co=no*no*no;
            count+=co;
            a=a/10;
        }
            if(count==n)
                return true;
            else
                return false;
            
        }
        boolean isDecimal()
        {
            int a=(int)n;
            double b=a;
            if(b==n)
            return false;
            else
            return true;
        }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        double nu=s.nextDouble();
        Number ob=new Number(nu);
        boolean a=ob.isZero();
        boolean b=ob.isOdd();
        boolean c=ob.isEven();
        boolean d=ob.isPrime();
        boolean e=ob.isArmstrong();
        System.out.println("IsZero "+a);
        System.out.println("IsOdd "+b);
        System.out.println("IsEven "+c);
        System.out.println("IsPrime "+d);
        System.out.println("IsArmstrong "+e);
        
    }
    }