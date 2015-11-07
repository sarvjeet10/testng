package exception;
import java.util.ArrayList;

public class dynArryList {

public static void main(String[] args) {
ArrayList<Number> a = new ArrayList<Number>();
a.add(10);
a.add(20);
a.add(30);
System.out.println(a);
a.add(1.44);
System.out.println(a);
a.set(2,210);
System.out.println(a);
for(Object i: a){
	System.out.print(i+" ");
}
	}
}
