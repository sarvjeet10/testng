package pack2;

class Book
{
	String title;
	Book(String title){
		this.title= title;
	}
	public String toString(){
		return title;
}
}
public class toStringPgm {
	public static void main(String[] args){
		Book[] bookArr = new Book[4];
		bookArr[0]= new Book("2 states");
		bookArr[1]=new Book("harry poter");
		bookArr[2]=new Book("java");
		bookArr[3]=new Book("c pggming");
		for(Book b:bookArr){
			System.out.println(b);
		}
	}
}
