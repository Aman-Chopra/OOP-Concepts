class Retire extends Personal
{
int Yrs;
double Pf;
double Grat;
Retire(String n,long p,double b,long a,int y)
{
super(n,p,b,a);
Yrs=y;
Pf=0.0;
Grat=0.0;
}
void provident()
{
Pf=.02*basic_pay*Yrs;
}
void gratuity()
{
if(Yrs>=10)
Grat=12*basic_pay;
else
Grat=0;
}
public void show()
{
super.show();
System.out.println("The no. of years of service are "+Yrs);
System.out.println("The calculated provident fund is Rs. "+Pf);
System.out.println("The calculated gratuity amount is Rs. "+Grat);
}
public static void main()
{
Retire b=new Retire("sonia",634,34343545,450,300);
b.provident();
b.gratuity();
b.show();
}
}
//Aman Chopra 
//12th Science
