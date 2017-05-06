import java.util.*;
class codewars
    {
        public static void main(String[] args)
            {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the statement");
                String st=s.nextLine();
                int l=st.length();
                String ans="";
                int b,c,i;
                for(i=0;i<l;i++)
                {
                    if(((int)st.charAt(i)>=65)&&((int)st.charAt(i)<=90))
                    {
                    b=(int)st.charAt(i)+13;
                    if(b>90)
                    {
                        b/=90;
                        b+=65;
                    }
                    ans+=(char)b;
                }
                else if(((int)st.charAt(i)>=97)&&((int)st.charAt(i)<=122))
                    {
                    c=(int)st.charAt(i)+13;
                    if(c>122)
                    {
                        c/=122;
                        c+=97;
                    }
                    ans+=(char)c;
                }
                else
                ans+=st.charAt(i);
            }
                System.out.println(ans);
                
                
            }
        }