class Strange
{
int ele[],count=0;
int capacity;
int top;
Strange(int cap)
{
capacity=cap;
top=-1;
ele=new int[capacity];
for(int i=0;i<capacity;i++)
{
ele[i]=-1;
}
}
void pushItem(int value)
{
top=0;
if (count>capacity-2)
{
System.out.println("Stack full, overflow");
System.exit(0);
}
int ctr=capacity-1;
if(ele[0]==-1)
ele[0]=value;
else
{
while(ctr!=top)
{
ele[ctr]=ele[ctr-1];
ctr--;
}
ele[ctr]=value;
count++;
}
}
void popItem()
{
int ce=0;
if(count==0)
{
System.out.println("Stack underflow");
}
for(int i=0;i<capacity-1;i++)
{
ele[i]=ele[i+1];
}
ele[capacity-1]=-1;
for(int i=0;i<capacity;i++)
{
System.out.println(ele[i]);
}
}
void display()
{
for(int i=0;i<capacity;i++)
{
System.out.println(ele[i]);
}
}
}

