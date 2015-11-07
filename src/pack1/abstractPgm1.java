package pack1;

abstract class AB
{
abstract void test1();
void test2()
{
System.out.println("test2");
}
} 
class BC extends AB
{
void test1()
{
System.out.println("test1");
}
}
public class abstractPgm1 
{
public static void main(String[] args)
{
BC b=new BC();
b.test1();
b.test2();
}
}

