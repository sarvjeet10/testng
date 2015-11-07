package pack2;

class ledLight implements Switch
{
	public void sON()
	{
		System.out.println("led light is on");
	}
	public void sON(int m)
	{
		System.out.println("led light is on for " +m+" mins");
	}
	public void sOFF()
	{
		System.out.println("led light is off");
	}
}
class interfaceEx {
	public static void main(String[] args)
	{
		ledLight l = new ledLight();
		l.sON();
		l.sON(2);
		l.sOFF();
	}
}
