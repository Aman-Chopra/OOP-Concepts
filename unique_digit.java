import java.util.*;
class unique_digit
{
public void main()
{
Scanner q=new Scanner(System.in);
int m=0;
int n=0;
String st="";
int count=0;
boolean value;
int flag=0;

do
{
flag=0;
System.out.println("Enter the value of first limit m LESS THAN 30000");
m=q.nextInt();
System.out.println("Enter the value of second limit n LESS THAN 30000 and n should be greater than m");
n=q.nextInt();
if(m>30000 || n>30000)
{
flag=1;
System.out.println("Values of m or n should be less than 30000.Please Re-enter");
continue;
}
if(m>n)
{
flag=1;
System.out.println("The value nof m should not be greater then n");
}
}while(flag==1);   
System.out.println("THE UNIQUE DIGIT INTEGERS ARE:");
for(int i=m;i<=n;i++)
    {
        st=Integer.toString(i);
        value=check(st);
        if(value==true)
        {
            
            System.out.print(st+",");
            count++;
        }
    }
    System.out.println();
    System.out.println("FREQUENCY OF UNIQUE-DIGIT INTEGERS IS " + count);
}
public boolean check(String str)
{
int flag=0;
String sp="";
String s="";
String spr="";
for(int i=0;i<str.length();i++)
{
sp=str.substring(0,i);
spr=str.substring((i+1),str.length());
s=sp+spr;
for(int j=0;j<s.length();j++)
{
if(str.charAt(i)==s.charAt(j))
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
    }

//AMAN CHOPRA
//11 SCIENCE

    
        