package pack1;

class a1{
int i = 10;
void test1(){
System.out.println(i);
}
}
class b extends a1{
	int j= 20;
	void test2(){
		System.out.println(i);
		System.out.println(j);	
	}
}
class  inheritencePgm1  extends b{
public static void main(String[] args){
	b b1= new b();
	b1.test1();
	b1.test2();
System.out.println(b1.i);
System.out.println(b1.j);
}
}


