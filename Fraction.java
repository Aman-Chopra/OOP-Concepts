import java.util.*;
class Fraction
{
    double num;double sum;
    double den;
    Fraction(double n,double d)
    {
        num=n;
        den=d;
    }
    double hcf(double s,double l)
    {
        double rem=l%s;
        if(rem==0)
        return s;
        else
        return hcf(rem,s);
    }
   double lcm(double n1,double n2)
    {
        double lowestCM=(n1*n2)/hcf(n1,n2);
        return lowestCM;
    }
    void reduce()
    {double h;
        do
        {           
             h=hcf(num,den);
            num=num/h;
            den=den/h;
            if(h==1)
            break;
        }while(h!=1);
    }
    Fraction addTo(Fraction f)
    {
        //Scanner s=new Scanner(System.in);
        //System.out.println("Enter numerator:");
        //f.num=s.nextInt();
        //System.out.println("Enter denoenator");
        //f.den=s.nextInt();
        //Fraction sumnum=new Fraction();
        //Fraction sumden=new Fraction();
        sum=(num/den)+(f.num/f.den);
        
        //do
        //{
          //  int 
        //f.den=s.nextInt;
        return f;
    }
    void main()
    {int n=1,d=1;
        Fraction f=new Fraction(n,d);
        //int h=hcf(n,d);
        //System.out.println(h);
       // int l=lcm(n,d);
       // System.out.println(l);
        Fraction ff=new Fraction(6,10);
        ff=addTo(f);
        System.out.println(f.sum);
    }
    
}
        