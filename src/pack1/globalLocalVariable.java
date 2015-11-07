package pack1;

public class globalLocalVariable{
	 static	int i = 30;
	 static	int k; 
	 //Initialization is not mandatory for global variable. by default int,short,long,byte = 0; float,double = 0.0;,
	 //char = empty;boolean=false;all derived type = NULL;
	static	float l;
	static	char m;
	static	boolean n;
	static String s;
	public static void main(String[] args){
	int i = 5;
	System.out.println("main class starts");
	System.out.println(i);
	System.out.println(globalLocalVariable.i);
	System.out.println(bb.i);
	System.out.println(cd.i);
	System.out.println(dd.j);
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	System.out.println(n);
	System.out.println(s);
	}
	}
	class bb{
		static int i =10;
	}
	class cd{
		static int i =15;
	}
	class dd{
			static int j = globalLocalVariable.i + bb.i + cd.i;
	}