package pack1;

class run2
{
{
System.out.println("non static block1");
}
run2()
{
	System.out.println("constructor");
}
{
System.out.println("non static block 2");
}
}
public class nonStaticBlk 
{
public static void main(String[] args)
{
System.out.println("main starts");
new run2();
new run2();
System.out.println("main ends");
}
}