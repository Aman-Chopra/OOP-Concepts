import java.util.*;
class date
{
public void main()
{
Scanner s=new Scanner(System.in);
int l=0;
int dn=0;
int y=0;
String st="";
int le=0;
int flag=0;
int da=0;
do
{
flag=0;
System.out.print("DAY NUMBER" + "\t" + ":");
dn=s.nextInt();
System.out.print("YEAR " + "\t" + ":");
y=s.nextInt();
l=y%4;
st=Integer.toString(y);
le=st.length();
if(le!=4)
{
System.out.print("Invalid year number . Please Re-enter everything again");
flag=1;
continue;
    }
if((l!=0) && (dn==366))
{
System.out.print("Invalid day number according to year . Please Re-enter everything again");
flag=1;
continue;
    }
if(dn>366)
{
System.out.print("Invalid day number . Please Re-enter everything again");
flag=1;
continue;
    }
System.out.print("DATE AFTER" + "\t" + " (N) : "); 
da=s.nextInt();
if((da>100) || (da<0))
{
System.out.print("Day after number should not exceed 100 and it should not be less than 0 . Please Re-enter everything again");
flag=1;
continue;
    }
}while(flag==1);
    
    String dates=giveno(dn,y);
    System.out.print(dates);
    int af=dn+da;
    if(af>365&&y%4==0)
    {
        af=af-366;
        y=y+1;
    }
    else if(af>365&&y%4!=0)
    {
       af=af-366;
       y=y+1;  
    }
    else
    af=af;
    String afterdate=giveno(af,y);
    System.out.println("DATE AFTER " + da + "DAY(S):\t " + afterdate);
}
    String giveno(int das,int year)
    {        
int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
if(year%4==0)
ar[1]=29;
int month=0;
while(das>=0)
{
if((das-ar[month])<0)
break;
das=das-ar[month];
month++;
if(das==0)
{
das=ar[month];
break;
    }
}
String str[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
String name=null;
if(das%10==1)
name=das+"ST";
else if(das%10==2)
name=das+"ND";
else if(das%10==3)
name=das+"RD";
else
name=das+"TH";
name=name+" "+str[month]+" "+year;
return name;
    }
}
//Aman Chopra 
//12th Science



 


