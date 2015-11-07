package pack1;
import java.util. Scanner;
//print distinct character of the given string

public class distintCharOfString {
	private static Scanner scn;

	public static void main(String[] args){
		scn = new Scanner(System.in);
		System.out.println("enter string");
		String s1= scn.next();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++){
			char c=s1.charAt(i);
			if(s2.indexOf(c)==-1){
				s2+=c;
			}
		}
		System.out.println(s2);
		int p1=s1.indexOf('e');
		int p2=s1.indexOf('e',p1+1);
		int p3=s1.indexOf('e',p2+1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		


	}

}
