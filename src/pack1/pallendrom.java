package pack1;

public class pallendrom {
	public static void main(String[] args){
		String s1=new String("rar");
		System.out.println(s1);
		String s2="java";
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3="";
		for(int i=s1.length()-1;i>=0;i--){
			System.out.print(s1.charAt(i));
			s3+=s1.charAt(i);
		}
System.out.println();
System.out.println(s3);

if(s1.equalsIgnoreCase(s3))
	System.out.println("pallendrom");
else
	System.out.println(" not pallendrom");


StringBuilder sb = new StringBuilder("NaoN");

if(sb.toString().equals(sb.reverse().toString()))
	  System.out.println("pallendrom");

else 
	  System.out.println(" not pallendrom");

	}
}
