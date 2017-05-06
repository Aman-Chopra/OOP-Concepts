import java.util.*;
class frequency
{
    void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter vale for N");
        int n=s.nextInt();
        String ar[]=new String[n];
        String inps;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            do
            {
                flag=0;
                inps=s.next();
                if(inps.length()>50)
                {
                    System.out.println("wrong input,Re enter");
                    flag=1;
                }
                else
                {
                    inps=inps.toUpperCase();
                    ar[i]=inps;
                }
            }while(flag==1);
        }
        int alpha[]=new int[26];
        for(int i=0;i<26;i++)
        alpha[i]=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            String str=ar[i];
            int st=ar[i].length();
            while(count<st)
            {
                for(int j=0;j<26;j++)
                {
                    if(str.charAt(count)==(char)(j+65))
                    {                       
                        alpha[j]++;
                        break;
                    }
                }
                count++;
            }
        }
        System.out.println("ALPHABET\tFREQUENCY COUNT");
        for(int i=0;i<25;i++)
        {
            if(alpha[i]!=0)
            {
                System.out.print((char)(i+65)+"\t\t"+alpha[i]);
                System.out.println();
        
            }
        }
    }
}