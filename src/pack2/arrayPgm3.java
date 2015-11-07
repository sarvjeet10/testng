package pack2;

public class arrayPgm3 {
	public static void main(String[] args){
		Object[] o1 = new Object[4];
		o1[0]=new Book("java");
		o1[1]=10;
		o1[2]=11.56;
		o1[3]='c';
		for(Object i:o1){
			System.out.println(i);
		}		
	}
}
