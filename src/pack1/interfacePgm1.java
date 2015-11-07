package pack1;

class C implements I1
{
	public void test1()
	{
		System.out.println("test1");
	}
}
public class interfacePgm1
{
	public static void main(String[] args)
	{
		C a1 = new C();
		a1.test1();
	}
}