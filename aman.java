/*class sestest
{
int a=1;
public void yo()
{
//System.out.println("Hi");
//System.out.println(ob1.a);
int b=2;
}
public static void main()
{
System.out.println("\f");
sestest ob=new sestest();
ob.yo();
//System.out.println(ob1.a);
int a=0;
int c=8;
int a1=2;
byte a4=1;
byte r=(byte)(a1*a4);
int q=a1*a4;
int a2=10000;
byte a3=(byte)a2;
System.out.println(a3);
System.out.println(q);
//System.out.println(c);
//System.out.println(a);
//System.out.println(ob.b);*/
//yo();
//}
//}
/*class Student10{  
    int id=1;  
    String name="aman";  
    static int v=9;
    Student10(int id,String name){  
       // id = this.id;  
   // name = this.name;
    this.id = id;  
    name = name;
    
    }  
    void display(){System.out.println(id+" "+name);}  
  
    public static void main(String args[]){  
    Student10 s1 = new Student10(111,"Karan");  
    Student10 s2 = new Student10(321,"Aryan");
    s1.display();
    s2.display();
}
}
  /*  s2.v++;
    System.out.println(s1.v);
    s1.display();  
    s2.display(); 
    char c=97;
    System.out.println(c);
    byte b=(byte)479;
    System.out.println(b);
    byte q=2;
    q++;
    q+=3;
    System.out.println(q);
    }  
}  */
/*class yo
{
public static void main(String args[])
{
aman ob1=new ashray();
ashray ob=new ashray();
//ob1=ob;
//ob.a++;
//ob1.a++;
System.out.println(ob1.a);
}
}
class aman
{
int a=5;
void show()
{
aman ob1=new aman();
aman ob=new aman();
ob1=ob;
ob1.a++;
//System.out.println(ob.a);
}
}
class ashray extends aman
{
int a=10;
int b=20;
public void sd()
{

}
}
/*import java.util.*;
class as
{
int u=9;
Scanner s=new Scanner(System.in);
public  void main()
{
int r=0;
System.out.println("\f");
boolean g = true;
if(g)
System.out.println(u);
int a =10;
int b=20;
int i=10;
i+=++i + i++ + ++i;
System.out.println(i);
System.out.println(++a);
System.out.println((a+b));
int q=s.nextInt();
String z=s.nextLine();
}
}*/
/*class Dispatch {
  public static void main(String args[]) {
    A a = new A(); 	// object of type A
    B b = new B();	// object of type B
    C c = new C(); 	// object of type C
    A r; 			// obtain a reference of type A    
	r = a; 		// r refers to an A object
    r.callme();		 // calls A's version of callme

    r = b; 	// r refers to a B object
    r.callme(); 	// calls B's version of callme

    r = c;	 // r refers to a C object
    r.callme(); 	// calls C's version of callme
  }     }
class A {
   void callme() {
     System.out.println("Inside A's callme method");
  }    }
class B extends A {
  // override callme()
  void callme() {
    System.out.println("Inside B's callme method");
  }    }
class C extends B {
  // override callme()
  void callme() {
    System.out.println("Inside C's callme method");
}
}*/
class aman
{
void main()
{
System.out.println("\f");
int x=6;
int a1;
int b;
int c;
a1=b=c=x;
int ar[][]={{1},{2,3,4},{5,6,7,8}};
//System.out.print(ar[0][1]);
int a[][]=new int[3][];
a[0]=new int[1];
a[1]=new int[3];
a[2]=new int[4];
int count=1;
for(int i=0;i<3;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(count+" ");
count++;
}
System.out.println();
}
}
}


