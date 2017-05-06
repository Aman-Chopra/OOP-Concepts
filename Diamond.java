import java.io.*;
import java.util.*;
class Diamond
{
void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        
       
        for(int i=1;i<=n;i++)
    {

        for(int j=n-i;j>=1;j--)
        System.out.print(" ");
        for(int k=1;k<=i;k++)
            System.out.print(k);
        for(int l=i-1;l>=1;l--)
            System.out.print(l);
        System.out.println();
    }
    
        for(int i=n-1;i>0;i--)
    {

        for(int j=n-i;j>=1;j--)
        System.out.print(" ");
        for(int k=1;k<=i;k++)
            System.out.print(k);
        for(int l=i-1;l>=1;l--)
            System.out.print(l);
        System.out.println();
    }
}
}