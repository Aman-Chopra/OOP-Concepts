import java.util.*;
class MatMultiply
{
    int ar1[][];
    int ar2[][];
    void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter order of first array");
        int m1=s.nextInt();
        int n1=s.nextInt();
        System.out.println("Enter order of second array");
        int m2=s.nextInt();
        int n2=s.nextInt();
        if(n1!=m2)
        {
            System.out.println("Cannot be multiplied");
            System.exit(0);
        }
        ar1=new int[m1][n1];
        ar1=input(ar1,m1,n1);
        ar2=new int[m2][n2];
        ar2=input(ar2,m2,n2);
        int mul[][]=new int[m1][n2];
        for(int r=0;r<m1;r++)
        {
            for(int c=0;c<n2;c++)
            {
                mul[r][c]=0;
            }
        }
        for(int r=0;r<m1;r++)
        {
            for(int c=0;c<n2;c++)
            {
                for(int i=0,j=0;i<n1;i++,j++)
                {
                    mul[r][c]=mul[r][c]+ar1[r][i]*ar2[j][c];
                }
            }
        }
        for(int r=0;r<m1;r++)
        {
            for(int c=0;c<n2;c++)
            {
                System.out.print(mul[r][c]+"\t");
            }
            System.out.println();
        }
    }
    int[][] input(int[][] temp,int a,int b)
    {
        Scanner s=new Scanner(System.in);
        temp=new int[a][b];
        for(int r=0;r<a;r++)
        {
            for(int c=0;c<b;c++)
            {
                System.out.println("Enter element at:["+(r+1)+"]["+(c+1)+"]");
                temp[r][c]=s.nextInt();
            }
        }
        return temp;
    }
}