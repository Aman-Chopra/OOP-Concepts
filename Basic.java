import java.util.*;
class Basic
{
int arr[]=new int[10];
Scanner s=new Scanner(System.in);
void input()
{
System.out.println("Enter the elements in the array");
for(int i=0;i<10;i++)
arr[i]=s.nextInt();
}
void display()
{
System.out.println("Array elements:");
for(int i=0;i<10;i++)
System.out.println(arr[i]);
}
void largest()
{
sort();
System.out.println("The largest element is "+arr[9]);
}
void average()
{
double count=0;
for(int i=0;i<9;i++)
count+=arr[i];
count/=10;
System.out.println("The average is "+count);
}
void sort()
{
int temp=0;
for(int i=0;i<9;i++)
{
for(int j=0;j<8-i;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("The sorted array is:");
for(int i=0;i<9;i++)
System.out.print(arr[i]+" ");
}
public void main(String args[])
{
Basic ob=new Basic();
ob.input();
ob.display();
ob.largest();
ob.average();
}
}

