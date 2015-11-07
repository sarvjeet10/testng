package pack1;

class c122
{
static
{
System.out.println("c loads");
}
c122()
{
System.out.println("c ctt");
}
}
class d extends c122
{
static
{
System.out.println("d loads");
}
d()
{
super();
System.out.println("d ctt");
}
}
public class inheritenceSuperConst{
public static void main(String[] args){
System.out.println("main loads");
new d();
System.out.println("main ends");
}
}


