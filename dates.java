import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
class dates
{
   static void date()throws Exception
   {
       
        DateFormat dateFormat = new SimpleDateFormat(" yyyy:MM:dd ");
        Date date = new Date();
        System.out.println("Date:" + dateFormat.format(date));
   }
   public static void main(String args[])throws IOException
   {
       String usr = "1000";
       String si = "CREATE TABLE "+usr+
                   "(doc_id VARCHAR(45) not NULL, " +
                   " Name_of_patient VARCHAR(45), " + 
                   " patient_id VARCHAR(45), " +  
                   " Date Date, " + " Problem VARCHAR(2000), " +
                   " PRIMARY KEY ( doc_id ))";
                   System.out.println(si);
        //System.out.print("\f");
        Scanner s = new Scanner(System.in);
        System.out.println("1. Sign up\n2. Log In");
        int token = s.nextInt();
        String name;
        String pass;
        if(token==1)
        {
            System.out.print("Name : ");
            name=s.next();
            System.out.print("Pass : ");
            pass=s.next();
            name+=".txt";
            File f = new File("C:/Aman",name);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(pass);
            bw.close();
            fw.close();
            System.out.println("You are successfully registered!");
        }
        System.out.println("Please enter the user name and password");
        name = s.next();
        name+=".txt";
        pass = s.next();
        try
        {
            File f = new File("C:/Aman",name);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr); 
            String st = br.readLine();
            br.close();
            fr.close();
        if(st.equals(pass))
        {
            System.out.println("\fWelcome!!");
            System.out.println("Please enter your choice");
            System.out.println("\n1.Clothes\n2.Gadgets");
            int ch = s.nextInt();
            String content[] = new String[2];
            content[0]="Clothes";
            content[1]="Gadgets";
            String clothes[] = new String[4];
            String gadgets[] = new String[4];
            clothes[0]="Jeans";
            clothes[1]="T-shirts";
            clothes[2]="Shirts";
            clothes[3]="Jackets";
            gadgets[0]="Laptops";
            gadgets[1]="Mobile";
            gadgets[2]="Play-station";
            gadgets[3]="Camera";
            int clothesr[] = new int[4];
            int clothesq[] = new int[4];
            clothesr[0]=100;
            clothesr[1]=150;
            clothesr[2]=120;
            clothesr[3]=430;
            clothesq[0]=10;
            clothesq[1]=15;
            clothesq[2]=12;
            clothesq[3]=43;
            int gadgetsr[] = new int[4];
            int gadgetsq[] = new int[4];
            gadgetsr[0]=100;
            gadgetsr[1]=150;
            gadgetsr[2]=120;
            gadgetsr[3]=430;
            gadgetsq[0]=10;
            gadgetsq[1]=15;
            gadgetsq[2]=12;
            gadgetsq[3]=43;
            int spac = 0;
            int max = 0;
            int quan = 0;
            String item = "";
            int i,j;
            int rate = 0;
            int chh = 0;
            if(ch==1)
            {
                max = 8;
                for(i=0;i<4;i++)
                {
                    String strr=clothes[i];
                    int le=strr.length();
                    spac=max-le;
                    System.out.print((i+1)+"."  +  "\t\t        "  +  strr );
                    for(j=0;j<spac;j++)
                    System.out.print(" ");
                    System.out.print( "\t\t\t" +  clothesq[i]  +  "\t\t\t"  +  "Rs."+clothesr[i]);
                    System.out.println();
                }
            System.out.println("Enter your choice");
            chh = s.nextInt();
            item = clothes[chh-1];
            rate = clothesr[chh-1];
            do
            {
                System.out.println("Enter the quantity");
                quan = s.nextInt();
                if(quan>clothesq[chh-1])
                System.out.println("These number of items are not available. Please re-enter");
            }while(quan>clothesq[chh-1]);
            clothesq[chh-1]-=quan;
        }
        else
            {
                max = 12;
                for(i=0;i<4;i++)
                {
                    String strr=gadgets[i];
                    int le=strr.length();
                    spac=max-le;
                    System.out.print((i+1)+"."  +  "\t\t        "  +  strr );
                    for(j=0;j<spac;j++)
                    System.out.print(" ");
                    System.out.print( "\t\t\t" +  gadgetsq[i]  +  "\t\t\t"  +  "Rs."+gadgetsr[i]);
                    System.out.println();
                }
            System.out.println("Enter your choice");
            chh = s.nextInt();
            item = gadgets[chh-1];
            rate = gadgetsr[chh-1];
            do
            {
                System.out.println("Enter the quantity");
                quan = s.nextInt();
                if(quan>gadgetsq[chh-1])
                System.out.println("These number of items are not available. Please re-enter");
            }while(quan>gadgetsq[chh-1]);
            gadgetsq[chh-1]-=quan;
        }
            
            System.out.println("Item has been successfully added to your cart!");
            System.out.println("Proceeding to billing");
            System.out.println("Please enter your address");
            String address = s.next();
            System.out.println("\fChoose your options");
            System.out.println("\n1.Cash on delivery\n2.Net banking\n3.Credit card");
            int pay = s.nextInt();
            String payment[] = new String[3];
            payment[0]="Cash on delivery";
            payment[1]="Net banking";
            payment[2]="Credit Card";
            System.out.println("Please enter the password again");
            String pa = s.next();
            if(pa.equals(pass))
            {
                System.out.println("\fProcessing.....");
                System.out.println("Payment successfully received!!");
                System.out.println("\nEnter \n1. To print Invoice\n2. To know the status of your order\n3. To give feedback");
                int c = s.nextInt();
                switch(c)
                {
                    case 1:
                        System.out.println("\fINVOICE");
                        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss ");
                        Date date = new Date();
                        System.out.println("Time: " + dateFormat.format(date));
                        date();
                        System.out.println("Item : "+item);
                        System.out.println("Quantity : "+quan);
                        System.out.println("Price/Piece : "+rate);
                        System.out.println("Total Bill : "+(rate*quan));
                        System.out.println("Address : "+address);
                        System.out.println("Payment status : "+payment[pay-1]);
                        System.exit(0);
                    case 2:
                        System.out.println("\fDelivery status");
                        System.out.println("Before how many days did you order?");
                        int days = s.nextInt();
                        if(days==1)
                        System.out.println("Packed");
                        else if(days==2)
                        System.out.println("Shipped");
                        else
                        System.out.println("Your order is out for delivery to your address "+address);
                        System.exit(0);
                    case 3:
                        System.out.println("\fPlease enter your suggesstion");
                        String sug = s.next();
                        File fi = new File("C:/Aman","suggesstions.txt");
                        FileWriter fw = new FileWriter(fi,true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(sug);
                        bw.newLine();
                        bw.close();
                        fw.close();
                        System.out.println("Your suggestion is successfully recorded");
                        System.exit(0);
            }
        }
            else
            {
                System.out.println("Invalid credentials.");
                System.exit(0);
            }
            
                    }
        else
        {
            System.out.println("Invalid credentials.");
            System.exit(0);
        }
    }
    catch(Exception e)
    {
        System.out.println("User does not exist!");
        System.exit(0);
    }
    }
}