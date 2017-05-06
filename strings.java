import java.io.*;
import java.util.*;
public class strings{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = s.next();
       while(true){
        System.out.println("1.Palindrome.\n2.Alphabetical order.\n3.Compare.\n4.Toggle Case.\n5.Exit");
        int n = s.nextInt();
        int l = st.length();
          switch(n)
          {
            case 1:
            String str = st.toLowerCase();
            int flag = 0;
            int lengt = l;
            for(int i=0;i<l/2;i++)
            {
                if(str.charAt(i)!=str.charAt(--lengt))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
            System.out.println("Palindrome");
            else
            System.out.println("Not palindrome");
            break;
            case 2:
            int len = st.length();
            char arr[] = st.toCharArray();
            Arrays.sort(arr,0,len);
            String text = String.valueOf(arr);
            System.out.println(text);
            break;
            case 3:
            System.out.println("Enter another string");
            String next = s.next();
            int i = st.compareTo(next);
            if(i==0)
            System.out.println("Given strings are equal.");
            else if(i<0)
            System.out.println(next+" is lexographically greater than "+st+".");
            else
            System.out.println(next+" is lexographically smaller than "+st+".");
            break;
            case 4:
            String ans = "";
            for(int j=0;j<st.length();j++)
            {
                if(Character.isUpperCase(st.charAt(j)))
                ans+=Character.toLowerCase(st.charAt(j));
                else
                ans+=Character.toUpperCase(st.charAt(j));
            }
            System.out.println(ans);
            break;
            case 5:
            System.exit(0);
            default:
            System.out.println("Enter a valid case");
          }
       }                
    }
}