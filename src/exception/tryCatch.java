package exception;

public class tryCatch {

	public static void main(String[] args) {
		System.out.println("main starts");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("thread is interepted");

		}
		System.out.println("main ends");


	}

}
