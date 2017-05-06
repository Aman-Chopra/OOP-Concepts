import java.io.*;
import java.util.*;
public class checksub{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = s.next();
        System.out.println("Enter the sub-string");
        String str = s.next();
        if(st.contains(str))
        System.out.println("YES");
        else
        System.out.println("NO");
        /*String a = new StringBuilder("hi").reverse().toString();
        System.out.println(a);*/
    }
}
        