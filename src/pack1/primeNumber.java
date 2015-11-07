package pack1;

public class primeNumber {
	public static void main(String[] args)
	  {
	    for(int i=20;i<=60;i++)
	      {
	        if(isPrime(i))
	         {
	        System.out.println(i);
	         }
	      }
	  }
	   static boolean isPrime(int a)
	   {
	     boolean flag =true;
	       for(int i=2;i<=(a-1);i++)
	         {
	          if(a%i==0)
	            {
	             flag=false;
	             break;
	            }
	         } 
	     return flag;
	    }
	}