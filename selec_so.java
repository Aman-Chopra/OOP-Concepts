import java.util.Scanner;
class selec_so
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
int temp,pos,min;
System.out.println("Printing original array");
for(int i=0;i<n;i++)
{
System.out.println(ar[i]);
}
for(int i=0;i<n;i++)
{
temp=ar[i];
pos=i;
min=ar[i];
for(int j=(i+1);j<n;j++)
{
if(ar[j]<min)
{
min=ar[j];
pos=j;
}
}
ar[i]=min;
ar[pos]=temp;
}
System.out.println("Printing sorted array");
for(int i=0;i<n;i++)
{
System.out.println(ar[i]);
}
}
}


