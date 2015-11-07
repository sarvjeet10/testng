package pack1;

public class compareTwoNumber{
public static void main(String[] args){
java.util.Scanner scn = new java.util.Scanner(System.in);
System.out.println("enter 1st number");
int i = scn.nextInt();
System.out.println("enter 2nd number");
int j = scn.nextInt();
if(i>j)
System.out.println(i+" is greater than "+j);
else if(j>i)
System.out.println(j+" is greater than "+i);
else
	System.out.println("both the numbers are same");
}
}