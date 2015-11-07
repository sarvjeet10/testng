package pack1;
import java.util.Scanner;
public class Shop {
	private Scanner scn;

	Bulb sellbulb(){
		scn = new Scanner(System.in);
		System.out.println("which bulb, type 1 for led 2 for cfl");
		int n = scn.nextInt();
		Bulb b = null;
		if(n==1)
		{
			b=new ledBulb();
		}
		else if(n==2){
			b=new cflBulb();
		}
		else{
			System.out.println("invalid");
		}
		return b;	
	}
}
