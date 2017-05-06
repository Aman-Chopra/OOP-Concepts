
 
import java.util.*;
class A extends Thread
{ int a,b;
  A(int a, int b)
  {this.a = a;
   this.b = b;
  }
  public void run()
  {System.out.println("Area = " + (a*b));}
  
  
  }
class B extends Thread
{int a,b;
 B(int a, int b)
 {this.a = a;
  this.b = b;
 }
 public void run()
 {System.out.println("Perimeter = " + (a+a+b+b));
          
}
}
public class L8q2 {

    
    public static void main(String[] args) {
        A obj1 = new A(10,20);
        obj1.start();
        B obj2 = new B(5,5);
        obj2.start();
        try
        {obj1.join();
         obj2.join();
        }
        catch(InterruptedException C)
        {System.out.println(C);}
         //System.out.println("Main Thread Ends!!!");
        boolean a = obj1.isAlive();
        System.out.println("Status of Thread A : " + a );
        boolean b = obj2.isAlive();
         System.out.println("Status of Thread B : " + b );
       
        }
    }
    

