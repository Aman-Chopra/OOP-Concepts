import java.util.Scanner;
class binary_sea
{
void main(int n)
{
Scanner s=new Scanner(System.in);
int ar[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Please enter entry no. "+(i+1));
ar[i]=s.nextInt();
}
System.out.println("Please enter the element to be searched");
int b=s.nextInt();
int l=0;
int u=n-1;
int m=0;
int pos=0;
int counter=0;
while(l<=u)
{
m=(l+u)/2;
if(b<ar[m])
{
u=m-1;
}
else if(b>ar[m])
{
l=m+1;
}
else
{
counter=1;
pos=m;
break;
}
}
if(counter==1)
System.out.println("The element is found at position "+(pos+1));
else
System.out.println("the element is not found");
}
}
