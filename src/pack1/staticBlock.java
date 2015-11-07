package pack1;

class a
{
static
{
System.out.println("block A");
}
}
public class staticBlock 
{
static
{
System.out.println("block B");
}
public static void main(String[] args)
{
System.out.println("main starts");
new a();
new a(); 
System.out.println("main ends");
}
}