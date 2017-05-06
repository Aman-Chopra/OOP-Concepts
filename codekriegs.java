import java.io.*;
import java.util.*;
public class codekriegs
{
    public static void main(String args[])
    {
        Scanner  s = new Scanner(System.in);
        System.out.println("Code");
        int n =s.nextInt();
        int count=0;
        boolean flag;
        String st,st1,st2;
        for(int i=0;i<n;i++)
        {
            String str = s.next();
            flag = pain(str); 
            if(flag==true)
            {
            System.out.println("-1");
            continue;
            }
            int l = str.length();
            st = str.substring(1,l);
            if(pain(st)==true)
                {
                System.out.println('0');
                continue;
                }
            for(int j=1;j<l;j++)
            {
               
                st = str.substring(0,j);
                st1 = str.substring(j+1,l);
                st2=st+st1;
                if(pain(st2)==true)
                {
                System.out.println(j);
                break;
                } 
            }
        
    }
}
    static boolean pain(String s)
    {
        String st="";
        for(int i=s.length()-1;i>=0;i--)
        st+=s.charAt(i);
        if(st.equals(s))
        return true;
        else
        return false;
    }
}