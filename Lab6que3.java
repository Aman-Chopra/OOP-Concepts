 
import java.util.*;

interface are
{
       void ar(int a,double b);
}
class rect implements are
{
        public void ar(int a,double b)
        {
            System.out.println("Area = "+(a*b));
        }
}
class circ implements are
{
        public void ar(int r,double p)
        {
            System.out.println("Area = "+ (p *r*r));
        }
}

public class Lab6que3 {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in); 
        int ch;
        int r;
        double p;
        while(true)
        {
                System.out.println("Press 1 for circle.\nPress 2 for rectangle.\nPress 0 for exit.");
                ch=s.nextInt();
                switch(ch)
                {
                    case 1:circ obj=new circ();
                          System.out.println("Enter the radius and value of pi.");
                          r=s.nextInt();
                          p=s.nextDouble();
                            obj.ar(r,p);
                            break;
                    case 2:rect ob=new rect();
                            System.out.println("Enter the dimensions of the rectangle.");
                            p=s.nextInt();
                            r=s.nextInt();
                            ob.ar(r,p);
                            break;
                    case 0: return;
                      
                }
        }
    }
    
}

