import java.io.*;
class Bike
{   int speedlimit;
    Bike(int sl)
    {
        speedlimit=sl;
    }
    void run()
        {
            System.out.println("The speedlimit is "+speedlimit);
        }
}
class Splender extends Bike
{   
    int speedlimit;
    Splender(int sll,int sl)
    {   
        super(sll);
        speedlimit=sl;
    }
    void run()
        {
             System.out.println("The speedlimit is "+speedlimit);
        }
}
public class A2
{
    public static void main(String[] args)
        {
            Bike ch = new Bike(5);
            Splender cr = new Splender(5,10);
            //type();
            Bike r;
            r=ch;
            r.run();
            r=cr;
            r.run();
        }
}
              
         
