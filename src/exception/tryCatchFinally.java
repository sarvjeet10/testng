package exception;

public class tryCatchFinally {

	public static void main(String[] args) {
System.out.println("main starts");

try{
	int k=10/0;
	System.out.println(k);

}
catch(Exception e){
	System.out.println("catch block");

}
finally{
	System.out.println("finaly block");

}
System.out.println("main ends");

	}

}
