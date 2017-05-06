class Sasmal
{
int N;
Sasmal()
{
N=0;
    }
    void getnum(int nn)
    {
        N=nn;
    }
    int power(int x)
    {
        int square=x*x;
        return square;
    }
    int sum_of_square(int x)
    {
    String s="";
    int l=0;
    String st="";
    int sum=0;
    int b=0;
    int c=0;
    
    do
    {
    s=Integer.toString(N);
    l=s.length();
    st="";
    sum=0;
    b=0;
    c=0;
    for(int i=0;i<l;i++)
    {
st=s.substring(i,(i+1));
b=Integer.parseInt(st);
c=power(b);
sum=sum+c;
N=sum;
        }
    }while(sum>9);
    return sum;
}
void isSasmal()
{
int sa=sum_of_square(N);
if(sa==1)
System.out.println("It is a sasmal number");
else
System.out.println("It is not a sasmal number");
    }

}
//Aman Chopra 
//12th Science

    
    