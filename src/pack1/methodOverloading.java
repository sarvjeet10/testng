package pack1;

public class methodOverloading //program for method overloading
{
	public static void main(String[] args)
	{
		System.out.println("program starts");
		test1();
		test1(10);
		test1(10,20);
		System.out.println("test1 method with single argument "+test1(50));
		System.out.println("test1 method with double argument and their sum is "+test1(40,60));
	}
	static void test1()
	{
		System.out.println("test1 without argument");
	}
	static int test1(int a)
	{
		System.out.println("test1 with argument "+a);
		return a;
	}
	static int test1(int a,int b)
	{
		System.out.println("test1 with two argument "+a+" and "+b);
		int sum =a+b;
		return sum;
	}
}
