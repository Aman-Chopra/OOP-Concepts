import java.util.*;
import java.lang.*;
import java.io.*;

class Emp implements Serializable
{
public String name;
public int eno;
public float salary;





void read()
{ 
Scanner in = new Scanner(System.in);
System.out.println("Enter following details");
System.out.println("Enter Name");
this.name = in.nextLine();
System.out.println("Enter Employee No.");
this.eno = in.nextInt();
System.out.println("Enter salary");
this.salary = in.nextFloat();
}
}



public class Prehell {

    public static void main(String[] args) { 
 try {
     
     File f = new File("C:/Aman","serial");
  int ch=0;
 Scanner in = new Scanner(System.in);
 System.out.println("How many employees?");
       ch = in.nextInt();
 
    
      
     int i=0; 
   Emp em[] = new Emp[ch];
   


FileOutputStream fos = new FileOutputStream(f);
ObjectOutputStream oos = new ObjectOutputStream(fos);

while(i<ch)
{ em[i]= new Emp();
em[i].read();
oos.writeObject(em[i]);
i++;
}
oos.close();

Emp object2 = new Emp();
      FileInputStream fis = new FileInputStream(f);
ObjectInputStream ois = new ObjectInputStream(fis);

i=0;
System.out.println("Name\tEmp No\tSalary"); 
while(i<ch)
{ 
object2 = (Emp)ois.readObject();
System.out.println(object2.name+"\t"+object2.eno+"\t"+object2.salary); 
i++;
}
ois.close();
}catch(Exception e){System.out.print("Error");}
}
}