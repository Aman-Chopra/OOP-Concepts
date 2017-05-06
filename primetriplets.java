import java.util.*;
class primetriplets
{
public void main()
{
Scanner q=new Scanner(System.in);
int S=0;
int L=0;
int flag=0;
do
{
flag=0;
System.out.println("Enter the value of first limit S GREATER THAN 0");
S=q.nextInt();
System.out.println("Enter the value of second limit L GREATER THAN 0 and L should be greater than S");
L=q.nextInt();
if(S<0 || L<0)
{
flag=1;
System.out.println("Values of S or L should be greater than 0.Please Re-enter");
continue;
}
if(S>L)
{
flag=1;
System.out.println("The value nof S should not be greater then L");
}
}while(flag==1);
boolean a;
boolean b; 
boolean c; 
boolean d;
int t=0;
int u=0; 
int v=0;
int count=0;
System.out.println("Prime Triplets are :");  
for(int i=S;i<=L;i++)
{
t=i+2;
u=i+6;
v=i+4;
a=prime(i);
b=prime(t);
c=prime(u);
d=prime(v);
if((a==true)&&(b==true)&&(c==true))
{
System.out.println(i+"\t"+t+"\t"+u);
count++;
    }
else if((a==true)&&(c==true)&&(d==true))
{
System.out.println(i+"\t"+u+"\t"+v);
count++;
    }
    else continue;
}
System.out.println(); 
System.out.println("Total Prime Triplets combinations in the range are " + count);
    }
    boolean prime(int f)
    {
        int flag=0;
        if(f==2)
        flag=0;
        for(int i=2;i<f;i++)
        {
if(f%i==0)
flag=1;
    }
    if(flag==0)
    return true;
    else 
    return false;
}
    }
//Aman Chopra 
//12th Science
    

    


