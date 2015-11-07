package pack1;

class c1
{
c1()
{
System.out.println("no parameter");
}
c1(int a)
{
System.out.println( "with paramaeter "+a);
}
}
public class constructorPgm 
{
public static void main(String[] args){
System.out.println("main starts");
new c1();
new c1(10);
System.out.println("main ends");
}
}