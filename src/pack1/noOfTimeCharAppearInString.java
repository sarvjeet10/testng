package pack1;

public class noOfTimeCharAppearInString {
public static void main(String[] args)
	{
		String s1="javadeveloper";
		String s2=s1.replace("e", "");
		System.out.println(s1.length()-s2.length());
		int count=0;
		for(int i=0;i<=s1.length()-1;i++){
			if(s1.charAt(i)=='e'){
				count++;
			}
		}
		System.out.println(count);	
	}
}
