 
import java.util.*;
import java.lang.*;

class Lab7que3
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the name of the student.");
        String name=s.nextLine();
        int total=0;
        int marks[]=new int[3];
        System.out.println("Enetr the marks in the three subjects.");
        for(int i=0;i<3;i++)
        {
            marks[i]=s.nextInt();
            total+=marks[i];
        }
        total=total/3;
        if(total>=90)
            System.out.println("Grade : A");
        else if(total>=80)
            System.out.println("Grade : B");
        else if(total>=70)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : D");
        
        System.out.println("Enter the roll number.");
        String roll=s.next();
        try
        {
            
            int rolln=Integer.parseInt(roll);
            System.out.println("Roll number is : "+rolln);
        }
        catch(NumberFormatException E)
        {
            System.out.println("ERROR :: Wrong roll number enetred.");
        }
    }
}