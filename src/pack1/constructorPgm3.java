package pack1;

class d2
{
d2()
{
System.out.println("default ctt");
}
d2(int i)
{
this();
System.out.println("int arguments");
}
}
public class constructorPgm3 {
public static void main(String[] args){
System.out.println("main starts");
new d2(10);
System.out.println("main ends");
}
}