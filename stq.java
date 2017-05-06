import java.util.*;
class stq
{
    void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string");
        String str=s.nextLine();
        StringBuffer ss=new StringBuffer(str);
        System.out.println("What do you want to do?");
        System.out.println("1)append");
        System.out.println("2)update");
        System.out.println("3)delete");
        int inp=s.nextInt();
        String newst="";
        if(inp==1)
        {
            System.out.println("Enter what you have to append");
            String appstr=s.next();
            ss.append(" ").append(appstr);
            System.out.println(ss);        
        }
        else if(inp==2)
        {
            System.out.println("where do you want to insert");
            int ins=s.nextInt();
            System.out.println("What do you want to insert");
            String inpstr=s.next();
            ss.insert(ins,inpstr);
            System.out.println(ss);
        }
        else if(inp==3)
        {
            System.out.println("From where do you want to start deletion?");
            int beg=s.nextInt();
            System.out.println("From where do you want to end deletion?");
            int end=s.nextInt();
            ss.delete(beg,end);
            System.out.println(ss);
        }
        else
        System.out.println("Wrong input");
    }
}
//Aman Chopra
//12th Science