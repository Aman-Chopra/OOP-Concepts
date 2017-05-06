
 

import java.util.*;

class A extends Thread
{ int a;
    A(int a)
    {this.a=a;}
    public void run()
    {System.out.println("a = " + a);
    }
}
class B implements Runnable
{ int b;
  B(int b)
  {this.b=b;}
  public void run()
  {System.out.println("b = "+b);}
  
  }

public class L8q1 {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("1. Extend \n 2. Implement");
     System.out.println("Enter choice :-");
     int ch = s.nextInt();
     switch(ch)
     {case 1 :
     A obj1 = new A(10);
     obj1.start();break;
     case 2 :
         B obj2 = new B(15);
     Thread obj3 = new Thread(obj2);
     obj3.start();break;
     default : System.out.println("Enter correctly!");
    }
    }
}
