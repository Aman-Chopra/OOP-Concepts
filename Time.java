import java.util.Scanner;
class Time
{
    void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Input Time\t");
        String time=s.next();
        System.out.println();
        int com=time.indexOf(',');
        int hr=Integer.parseInt(time.substring(0,com));
        int min=Integer.parseInt(time.substring(com+1,time.length()));
        if(hr>12||min>=60)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.print(hr+":"+min+" ");
        if(min==0)
        System.out.print(toName(hr)+" O'clock");
        else if(min<30)
        {
            if(min==15)
            System.out.print("Quater past "+toName(hr));
            else
            System.out.print(toName(min)+" minutes past "+toName(hr));
        }
        else if(min==30)
        System.out.print("Half past "+toName(hr));
        else
        {
            if(min==45)
            System.out.print("Quater to "+toName(hr+1));
            else
            System.out.print(toName(60-min)+" minutes to "+toName(hr+1));
        }
    }
    String toName(int x)
    {
        String name="";
        if(x<10)
        {
            name=toNamenum(x);    
        }
        else if(x>=10&&x<20)
        {
            if(x==10)
            name="ten";
            else if(x==11)
            name="eleven";
            else if(x==12)
            name="twelve";
            else if(x==13)
            name="thirteen";
            else
            name=toNamenum(x%10)+"teen";  
        }
        else
        {
            name="twenty "+toNamenum(x%10);
        }
        return name;
    }
    String toNamenum(int a)
    {
        String str="";
        switch(a)
        {
            case 1:
            str="one";
            break;
            case 2:
            str="two";
            break;
            case 3:
            str="three";
            break;
            case 4:
            str="four";
            break;
            case 5:
            str="five";
            break;
            case 6:
            str="six";
            break;
            case 7:
            str="seven";
            break;
            case 8:
            str="eight";
            break;
            case 9:
            str="nine";
            break;
            default:
            str="";
        }
        return str;
    }
}
//Aman Chopra 
//12th Science