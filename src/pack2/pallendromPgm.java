package pack2;

public class pallendromPgm {
	
		public static void main(String args[]){
			String s1 = "NAN";
			String s2 = "";
			for(int i=s1.length()-1;i>=0;i--){
				s2+=s1.charAt(i);				
			}
			if(s1.equalsIgnoreCase(s2)){
				System.out.println("The given string " +s2+ " is pallendrom");
			}
			else{
				System.out.println("The given string " +s2+ " is not pallendrom");
			}
		}
	}


