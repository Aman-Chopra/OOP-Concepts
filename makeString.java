import java.util.*;
public class makeString
    {
        public static void main(String args[])
        {
            //System.out.println("Hi");
            Scanner in = new Scanner(System.in);
            long i = 0;
            long n = in.nextLong();
            long number = 0;
            String ans = "";
            int ascii = 97;
            long no = 1;
            char a;
            for(i = 0;i < n; i++)
            {
                ans = "";
                number = in.nextLong();
                ascii = 97;
                no = 1;
                while(no<=number)
                {
                    if(ascii>122)
                    {
                        ascii = 97;
                    }
                    a = (char)(ascii);
                    ans += a;
                    ascii++;
                    no++;
                }      
                System.out.println(ans);
            }
        }
    }
            