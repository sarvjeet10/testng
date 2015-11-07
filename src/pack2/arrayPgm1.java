package pack2;

public class arrayPgm1 {
	public static void main(String[] args){
		int[] a = new int[4];
		a[0]=10;
		a[1]=5;
		a[2]=34;
		a[3]=6;
		System.out.println("Size of the array is: "+a.length);		
		System.out.println("Elements in the array are: ");	
		for(int i =0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();		
		System.out.println("Elements in the array using for each loop are: ");		
		for(int j: a){
			System.out.print(j+" ");
		}		
		System.out.println();
		int big=0;	
		for(int k: a){
			if(k>big){
			 big=k;
			}
		}
		System.out.println("Biggest number in the array is :"+big);
	}
	}
