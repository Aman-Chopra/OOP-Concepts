import java.io.*;
import java.util.*;
class Medical
{
    public static void main()throws IOException
    {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        int l=0;
        int flag=0;
        String id="";
        String date="";
        String disease="";
        String msd="";
        String tsd="";
        String rop="";
        String name="";
        String c="";
        String bg="";
        String pd="";
        String sr="";
        String eid="";
        System.out.println("Global Patient History Record");
        System.out.println();
        do
        {
            flag=0;
            System.out.print("Personal identification no. :- ");
            id=s.readLine();
            l=id.length();
            if(l!=10)
            {
                flag=1;
                System.out.println("Invalid ID");
            }
        }while(flag==1);   
        String idf=id+".txt";
        File f=new File(idf);
        if(f.exists())
        {
            System.out.println("\f");
            System.out.println("Global Patient History Record");
            System.out.println();
            FileReader g=new FileReader(idf);
            BufferedReader b=new BufferedReader(g);
            String ss;
            while((ss=b.readLine())!=null)
            {
                System.out.println(ss);
            }
            b.close();
            g.close();
            System.out.println();
            System.out.println("Please enter the details of your today's visit");
            System.out.println();
            FileWriter d=new FileWriter(idf,true);
            PrintWriter P=new PrintWriter(d);
            System.out.print("Date of visit:- ");
            date=s.readLine();
            P.println("Date of visit:- "+date);
            System.out.print("Disease:- ");
            disease=s.readLine();
            P.println("Disease:- "+disease);
            System.out.print("Medicines suggested by the doctor:- ");
            msd=s.readLine();
            P.println("Medicines suggested by the doctor:- "+msd);
            System.out.print("Test suggested by the doctor:- ");
            tsd=s.readLine();
            P.println("Test suggested by the doctor:- "+tsd);
            System.out.print("Remarks on report:- ");
            rop=s.readLine();
            P.println("Remarks on report:- "+rop);
            System.out.println();
            System.out.println("The details are successfully entered in your record");
            P.close();
            d.close();
        }
        else
        {
            System.out.println("Your record does not exists");
            System.out.println("We will make a new record for you");
            System.out.println();
            System.out.println("Please enter the details");
            FileWriter di=new FileWriter(idf,true);
            PrintWriter Pi=new PrintWriter(di);
            System.out.print("Name:- ");
            name=s.readLine();
            Pi.println("Name:- "+name);
            System.out.print("Permanent address:- ");
            pd=s.readLine();
            Pi.println("Permanent address:- "+pd);
            System.out.print("Contact no.:- ");
            c=s.readLine();
            Pi.println("Contact no.:- "+c);
            System.out.print("Email id:- ");
            eid=s.readLine();
            Pi.println("Email id:- "+eid);
            System.out.print("Blood group:- ");
            bg=s.readLine();
            Pi.println("Blood group:- "+bg);
            System.out.print("Specific disease record in history:- ");
            sr=s.readLine();
            Pi.println("Specific disease record in history:- "+sr);
            Pi.println();
            Pi.println("Patient history record");
            Pi.println();
            System.out.println();
            System.out.println("Please enter the details of your today's visit");
            System.out.println();
            System.out.print("Date of visit:- ");
            date=s.readLine();
            Pi.println("Date of visit:- "+date);
            System.out.print("Disease:- ");
            disease=s.readLine();
            Pi.println("Disease:- "+disease);
            System.out.print("Medicines suggested by the doctor:- ");
            msd=s.readLine();
            Pi.println("Medicines suggested by the doctor:- "+msd);
            System.out.print("Test suggested by the doctor:- ");
            tsd=s.readLine();
            Pi.println("Test suggested by the doctor:- "+tsd);
            System.out.print("Remarks on report:- ");
            rop=s.readLine();
            Pi.println("Remarks on report:- "+rop);
            System.out.println();
            System.out.println("Your record is successfully created");
            Pi.close();
            di.close();
        }
    }
}