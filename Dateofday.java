import java.util.*;
class Dateofday
{
    void main()
    {
        Scanner s=new Scanner(System.in);
        String date;
        int flag=0;
        System.out.print("Date(dd/mm/yyyy):");
        int dat=0;
        int month=0;
        int year=0;
        String day="";
        do
        {
            date=s.next();
            if(date.charAt(2)!='/'||date.charAt(5)!='/')
            {
                if(date.length()!=10)
                {
                    System.out.println("Invalid date");
                    flag=1;
                    continue;
                }
            }          
            dat=Integer.parseInt(date.substring(0,2));
            month=Integer.parseInt(date.substring(3,5));
            year=Integer.parseInt(date.substring(6,10));
            boolean valdat=validity(dat,month,year);
            if(valdat==false)
            {
                System.out.println("Invalid date");
                flag=1;
                continue;
            }
        }while(flag==1);
        do
        {
            flag=1;    
            System.out.print("Day on 1st January:");
            day=s.next();
            System.out.println();
            if(day.equalsIgnoreCase("sunday")||day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday")||day.equalsIgnoreCase("saturday"))
            {
                flag=0;
                break;
            }
            System.out.println("Invalid Day");
        }while(flag==1);
        int count=0;
        if(month==1)
        count=-1;
            
        for(int i=1;i<month;i++)
        {
            
            
            if(i==3||i==5||i==7||i==8||i==10||i==12)
            {
                count=count+31;
            }
            if(i==1||i==4||i==6||i==9||i==11)
            {
                count=count+30;
            }
            if(year%4==0&&i==2)
            count=count+29;
            if(year%4!=0&&i==2)
            count=count+28;
        }
        count=count+dat;
        int mod7=count%7;
        String ar[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int pos=0;
        for(int i=0;i<7;i++)
        {
            if(day.equalsIgnoreCase(ar[i]))
            {
                pos=i;
                break;
            }
        }
        String newday=null;
        for(int i=1;i<=mod7;i++)
        {
            newday=ar[pos+1];
            if(i<5&&day.equalsIgnoreCase("Saturday"))
            {
                pos=-1;
                continue;
            }
            pos++;
        }
        if(newday==null)
        newday=day;
        System.out.println("Day on "+date+":"+newday);
    }
    boolean validity(int d,int m,int y)
    {
       
        int stag=0;
        if(d<1||d>31)
        stag=1;
        if(m<1||m>12)
        stag=1;
        if(d==31)
        {
            if(m==2||m==4||m==6||m==9||m==11)
            stag=1;
        }
        if(d==30)
        {
            if(m==1||m==2||m==3||m==5||m==7||m==8||m==10||m==12)
            stag=1;
        }
        if(y%4==0&&m==2)
        {
            if(d>29)
            stag=1;
        }
        if(y%4!=0&&m==2)
        {
            if(d>28)
            stag=1;
        }
        if(stag==1)
        return false;
        else
        return true;
    }
   
}
//AMAN CHOPRA
//12 SCIENCE