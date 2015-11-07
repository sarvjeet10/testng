package pack1;

public class evenOddPgm {
private static java.util.Scanner scn1;
public static void main(String[] args){
	scn1 = new java.util.Scanner(System.in);
    System.out.println("enter the number");
	int a = scn1.nextInt();
	int res = a%2;
	if(res==0)
	System.out.println("even");
	else
	System.out.println("odd");
	}
	}