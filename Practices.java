import java.io.*;
public class Practices {

    
    public static void main(String[] args)//throws IOException {
        {
            try
            {
        System.out.println("Starting now");
        System.out.println();
        System.out.println();
        File f = new File("C:/Aman","practice.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String st="";
        while((st=br.readLine())!=null)
        { 
            System.out.println(st);
        }
        fr.close();
        br.close();
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write("Append baby now.\n\n\n");
        bw.close();
        fw.close();
        System.out.println();
        System.out.println();
        FileReader frr = new FileReader(f);
        BufferedReader brr = new BufferedReader(frr);
        String sty="";
        String se="";
        while((sty=brr.readLine())!=null)
        { 
            se=reverse(sty);
            System.out.println(se);
            se="";
        }
        brr.close();
        frr.close();
    }
    catch(IOException e)
    {
    }
    }
    static String reverse(String ar)
    {
        String am="";
        int l = ar.length();
        for(int i=l-1;i>=0;i--)
        am+=ar.charAt(i);
        return am;
    }
}