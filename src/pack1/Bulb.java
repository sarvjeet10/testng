package pack1;

public interface Bulb{
	void son();
	void soff();
}
class ledBulb implements Bulb{
	public void son(){
		System.out.println("led light is on");
	}
	public void soff(){
		System.out.println("led light is off");
	}
}
class cflBulb implements Bulb{
	public void son(){
		System.out.println("cfl light is on");
	}
	public void soff(){
		System.out.println("cfl light is off");
	}
}

