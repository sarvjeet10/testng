package exception;
import java.util.ArrayList;
public class arrayList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add("java");
		a.add(130);
		a.add(300.450);
System.out.println("size:"+a.size());
System.out.println(a);
System.out.println("1st element:"+a.get(0));
System.out.println("2nd element:"+a.get(1));
System.out.println("3rd element:"+a.get(2));
System.out.println("iterating using for each");
for(Object i: a){
	System.out.println(i);
}
	}
}
