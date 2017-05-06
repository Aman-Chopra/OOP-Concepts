class Bill extends Detail
{
int n;
double amt;
Bill(String s,String a,long t,double r,int no)
{
super(s,a,t,r);
n=no;
amt=0.0;
}
void calc()
{
if(n>0 && n<=100)
amt=rent;
else if(n>100 && n<=200)
amt=(.6*n)+rent;
else if(n>200 && n<=300)
amt=(.8*n)+rent;
else
amt=n+rent;
}
public void show()
{
super.show();
System.out.println("The no. of days are "+n);
System.out.println("The calculated amount is Rs. "+amt);
}
public static void main()
{
Bill b=new Bill("sonia","c-90",34343545,450,300);
b.calc();
b.show();
}
}
//Aman Chopra 
//12th Science