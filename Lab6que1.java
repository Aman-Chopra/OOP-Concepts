 
import java.util.*;
interface company
{
    void sales(int n);
    void display();
}
class hardware implements company
{
        String cat="HP monitors";
        String man="HP services India";
       int num;
       public void sales(int n)
       {
           num=n;
       }
       public void display()
       {
           System.out.println("Category of item : "+cat+"\nManufacturers : "+man+"\nSales : "+num);
       }
}
class software implements company
{
        String cat="Sublime text";
        String man="LinuX OS";
       int num;
       public void sales(int n)
       {
           num=n;
       }
       public void display()
       {
           System.out.println("Type of software : "+cat+"\nOperating system : "+man+"\nSales : "+num);
       }
}

public class Lab6que1 {

    public static void main(String[] args) 
    {
        int no;
        Scanner s=new Scanner(System.in);
        hardware ob=new hardware();
        System.out.println("Enter the number of sales of hardware.");
        no=s.nextInt();
        ob.sales(no);
        ob.display();
        software obj=new software();
        System.out.println("Enter the number of sales of software.");
        no=s.nextInt();
        obj.sales(no);
        obj.display();
        System.out.println("Total number of sales : " + (ob.num+obj.num));
    }
    
}
