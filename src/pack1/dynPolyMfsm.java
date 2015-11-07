package pack1;
class BB1
{
	void test1()
	{
		System.out.println("test1 in class B");
	}
}

class CC extends BB1
{
	void test2()
	{
		System.out.println("test2 in class C");
	}
}

class DD1 extends CC
{
	void test3()
	{
		System.out.println("test3 in class D");
	}
}

public class dynPolyMfsm {
	public static void main(String[] a)
	{
		DD1 d1 = new DD1();
		d1.test1();
		d1.test2();
		d1.test3();
		CC c1=d1;
		c1.test1();
		c1.test2();
		//c1.test3();
		BB1 b1 = d1;
		b1.test1();
		//b1.test2();
		//b1.test3();
	}

}
