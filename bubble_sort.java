import java.util.Scanner;
class bubble_sort
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
    int temp;
    System.out.println("Printing original array");
    for(int i=0;i<n;i++)
    {
        System.out.println(ar[i]);
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<(n-i-1);j++)
        {
            if(ar[j]>ar[j+1])
            {
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
        }
    }
    System.out.println("Printing sorted array");
    for(int i=0;i<n;i++)
    {
        System.out.println(ar[i]);
    }
}
}

