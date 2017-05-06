import java.util.*;
class MatrixTrans
{
    int orig[][];
    Scanner s=new Scanner(System.in);
    void main()
    {
        System.out.println("Enter order of matrix");
        int order=s.nextInt();
        orig=new int[order][order];
        orig=enterValue(orig,order);
        int trans[][]=new int[order][order];
        System.out.println("Entered array:");
        for(int r=0;r<order;r++)
        {
            for(int c=0;c<order;c++)
            {
                System.out.print(orig[r][c]+"\t");
            }
            System.out.println();
        }
        for(int r=0;r<order;r++)
        {
            for(int c=0;c<order;c++)
            {
                trans[r][c]=orig[c][r];
            }
        }
        System.out.println("Transpose is:");
        for(int r=0;r<order;r++)
        {
            for(int c=0;c<order;c++)
            {
                System.out.print(trans[r][c]+"\t");
            }
            System.out.println();
        }
    }
    int[][] enterValue(int[][] temp,int a)
    {
        temp=new int[a][a];
        for(int r=0;r<a;r++)
        {
            for(int c=0;c<a;c++)
            {
                System.out.println("Enter element at:["+(r+1)+"]["+(c+1)+"]");
                temp[r][c]=s.nextInt();
            }
        }
        return temp;
    }
}
