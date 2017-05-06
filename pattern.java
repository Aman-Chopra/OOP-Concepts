class pattern
{
    int v=0;
    void main(int n)
    {
        v=n;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                even(i);
            }
            else
            {
                odd(i);
            }
        }
    }
    void even(int h)
    {
        System.out.println();
        for(int i=1;i<v;i++)
        {
            System.out.print(" ");
        }
        for(int j=h;j>=1;j--)
        {
            System.out.print(j);
        }
    }
    void odd(int g)
    {
        System.out.println();
        int s=v-g;
        for(int i=1;i<=s;i++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=g;j++)
        {
            System.out.print(j);
        }
    }
}