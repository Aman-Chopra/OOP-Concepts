
package l8q4;

import java.util.*;
class A extends Thread{  
 public void run(){  
     
   System.out.println("running thread name is:"+Thread.currentThread().getName());  
   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
   try{  
Thread.sleep(1000);  
System.out.println("task");  
}catch(InterruptedException e){  
throw new RuntimeException("Thread interrupted..."+e);  
}  
  
  }  
}
public class L8q4 {

    
    public static void main(String[] args) {
        A m1=new A();  
   A m2=new A();  
  m1.setPriority(Thread.MIN_PRIORITY);  
  m2.setPriority(Thread.MAX_PRIORITY);  
  m1.start();  
  m2.start();  
    
    try{  
m1.interrupt();  
}catch(Exception e){System.out.println("Exception handled "+e);}  
}
}
