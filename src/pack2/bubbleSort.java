package pack2;

public class bubbleSort {
	public static void main(String[] args){
		int[] a = {6,1,3,8,10,56,2};
		int temp;		
		System.out.println(a.length);
		for(int i=1;i<=a.length-1;i++){
			for(int j=0;j<=a.length-2;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k: a){
		System.out.println(k);
		}
	}
}
