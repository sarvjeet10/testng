package pack1;

public class asciinumberOfString {
	public static void main(String[] args){
		
	
	String s1="java1239";
	String s2="";
	//int s2=0;
			for(int i=0;i<=s1.length()-1;i++){
				char c=s1.charAt(i);	
				System.out.println((int)c);	
				if(c>=48 && c<=57){
					s2+=c;
				}
			}
		System.out.println(s2);	
	}

}
