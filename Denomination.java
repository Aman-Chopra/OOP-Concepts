import java.util.*;
class Denomination
{
public void main()
{
Scanner s=new Scanner(System.in);
int a=0;
String st="";
int l=0;
int flag=0;
String sr="";
int q=0;
int f=0;
do
{
flag=0;
System.out.println("Enter the amount");
a=s.nextInt();
st=Integer.toString(a);
l=st.length();
if(l>5)
{
flag=1;
System.out.println("INVALID AMOUNT.Please Re-enter");
continue;
}
}while(flag==1);   
String ds=toWords(a);
System.out.println(ds);
do
{
f=display(a);
a=f;
}while(a>=1);
}
int display(int n)
{
int m=0;
int c=0;
int j=0;
if(n>1000)
{
m=n/1000;
c=m*1000;
System.out.println("1000 * " + m + " =" + c);
j=n-c;
}
else if((n>=500) && (n<1000))
{
m=n/500;
c=m*500;
System.out.println("500 * " + m + " =" + c);
j=n-c;
}
else if((n>=100) && (n<500))
{
m=n/100;
c=m*100;
System.out.println("100 * " + m + " =" + c);
j=n-c;
}
else if((n>=50) && (n<100))
{
m=n/50;
c=m*50;
System.out.println("50 * " + m + " =" + c);
j=n-c;

}
else if((n>=20) && (n<50))
{
m=n/20;
c=m*20;
System.out.println("20 * " + m + " =" + c);
j=n-c;

}
else if((n>=10) && (n<20))
{
m=n/10;
c=m*10;
System.out.println("10 * " + m + " =" + c);
j=n-c;

}
else if((n>=5) && (n<10))
{
m=n/5;
c=m*5;
System.out.println("5 * " + m + " =" + c);
j=n-c;

}
else if((n>=2) && (n<5))
{
m=n/2;
c=m*2;
System.out.println("2 * " + m + " =" + c);
j=n-c;

}
else if(n==1)
{
m=n;
c=m*1;
System.out.println("1 * " + m + " =" + c);
j=n-c;

}
return j;
}
String toWords(int an)
    {
        String s="";
        String str[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        int n=an,rem=0;
        while(n!=0)
        {
            rem=n%10;
            s=str[rem]+" "+s;
            n=n/10;
            ;
        }
        return s;
    }
}