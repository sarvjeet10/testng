package exception;
import java.util.Scanner;

public class ATM {

	private static Scanner scn;

	public static void main(String[] args) {
Account a=new Account(1000);
	scn = new Scanner(System.in);
	System.out.println("welcome");
	String s = null;
	do{
		System.out.println("enter choice");
		System.out.println("to chk bal type 'v'");
		System.out.println("to withdraw 'w'");
		System.out.println("to deposit 'd'");
		String ip=scn.next();
		if(ip.equalsIgnoreCase("v")){
			System.out.println("current bal "+a.getbalance()+" Rs.");
		}
			else if(ip.equalsIgnoreCase("d")){
				System.out.println("type amount");
				int amt = scn.nextInt();
				a.deposit(amt);
				System.out.println("amt deposited");
		}
			else if(ip.equalsIgnoreCase("w")){
				System.out.println("type amount");
				int amt = scn.nextInt();
try{
	a.withdraw(amt);
	System.out.println("succesful");

}
catch(insufficientbalanceexception e) {
	System.out.println(e.getMessage());
}
			}

System.out.println("Do you want to continue(y/n)");
s=scn.next();
	}
	while(s.equalsIgnoreCase("y"));

	}

}
