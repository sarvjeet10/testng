package pack1;

class BMW implements car1
{
	public void start()
	{
		System.out.println("bmw starts");
	}
	public void cruzecontrol()
	{
		System.out.println("bmw cruze control starts");
	}
}
class NANO implements car1
{
	public void start()
	{
		System.out.println("NANO starts");
	}
	public void rotatewindow()
	{
		System.out.println("window opens");
	}
}
class C11 implements I1
{
	public void test1()
	{
		System.out.println("test1");
	}
}
public class car
{
	public static void main(String[] args)
	{
		C11 a1 = new C11();
		a1.test1();
		NANO n1 = new NANO();
		n1.rotatewindow();
		n1.start();
		BMW bmw = new BMW();
		bmw.cruzecontrol();
		bmw.start();
	}
}
