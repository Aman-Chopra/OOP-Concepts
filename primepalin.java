import java.util.*;
class primepalin
{
public void main()
{
Scanner q=new Scanner(System.in);
int m=0;
int n=0;
boolean b;
boolean z;
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
System.out.println("The prime palin numbers between " + m + " and " + n + " are :- ");
System.out.println();
for(int i=(m+1);i<n;i++)
{
b=palin(i);
z=prime(i);
if((b==true) && (z==true))
System.out.println(i);
    }
}
boolean palin(int a)
{
char c;
String s="";
String st=Integer.toString(a);
int l=st.length();

for(int i=(l-1);i>=0;i--)
{
c=st.charAt(i);
s=s+c;
    }
 
    if(st.equalsIgnoreCase(s))
    return true;
    else
    return false;
}
boolean prime(int b)
{
int flag=0;
int g=0;
if(b==2)
return true;
else
{
for(int i=2;i<b;i++)
{
g=b%i;
if(g==0)
{
flag=1;
break;
    }
}
if(flag==0)
return true;
else
return false;
    }
}
    }
    
//AMAN CHOPRA
//11 SCIENCE
    
    
   