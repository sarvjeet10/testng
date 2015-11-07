package pack1;

public class overridingPgm
{
final static int i = 20;
public static void main(String[] args)
{
System.out.println(i);

//i=20; this is an error
System.out.println(i);

B11 b = new B11();
C12 c = new C12();

b.test1();
c.test2();
c.test1();
 }
}
class A11
{
	void test1()
	{
		System.out.println("test1");	
	}
}
class B11 extends A11
{
	void test1() 
	{
		System.out.println("test2");	
	}	
}
class C12 extends B11
{
void test2()
	{
		System.out.println("test1");
	}
}




