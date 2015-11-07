package pack1;

public class variableConcept {
	static int i = 100;
	int j;
	void test1()
	{
	System.out.println(i);
	System.out.println(j);
	}
	public static void main(String[] args)
	{
	System.out.println("main starts here");
	variableConcept.i = 1000;
	variableConcept r1 = new variableConcept();
	r1.test1();
	r1.j = 200;
	r1.test1();
	variableConcept r2 = new variableConcept();
	r2.j = 300;
	r2.test1();
	System.out.println("main ends here");
	}
	}