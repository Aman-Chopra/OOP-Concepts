import java.util.*;
import java.io.*;
class supppppp
{
    public static void main(String args[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1.Write\n2.Read\n3.Copy");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1:
                FileWriter ss=new FileWriter("rateregister.txt");
                BufferedWriter hl=new BufferedWriter(ss);
                PrintWriter pw=new PrintWriter(hl);
                System.out.println("Enter the contents");
                s.nextLine();
                String str=s.nextLine();
                pw.println(str);
                pw.close();
                hl.close();
                break;
            case 2:
                FileReader ul=new FileReader("rateregister.txt");
                BufferedReader oq=new BufferedReader(ul);
                String yo="";
                while((yo=oq.readLine())!=null)
                    System.out.println(yo);
                break;
            case 3:
                FileWriter f1=new FileWriter("getrateregister.txt");
                BufferedWriter b1=new BufferedWriter(f1);
                PrintWriter pa=new PrintWriter(b1);
                FileReader ull=new FileReader("rateregister.txt");
                BufferedReader oqq=new BufferedReader(ull);
                String yoo="";
                String ui="";
                while((yoo=oqq.readLine())!=null)
                    ui+=yoo;
               // System.out.println(ui);
                pa.println(ui);
                pa.close();
                b1.close();
                System.out.println("Contents of copied file are: ");
                 FileReader fr=new FileReader("getrateregister.txt");
                BufferedReader brr=new BufferedReader(fr);
                String con="";
                while((con=brr.readLine())!=null)
                    System.out.println(con);
                break;
            default:System.out.println("Enter a valide choice");
                
           
                
                
        }
        
        
    }
}
