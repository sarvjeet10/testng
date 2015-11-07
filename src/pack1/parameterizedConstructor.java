package pack1;

class box
{
int length;
int width;
int height;
box()
{
}
box(int l,int w,int h)
{
length=l;
width=w;
height=h;
System.out.println("parameterized constructor");
}
box(int dim)
{
length=width=height=dim;
}
box(box b)
{
length=b.length;
width=b.width;
height=b.height;
}
void printDimention()
{
System.out.println("("+length+","+width+","+height+")");
}
}
public class parameterizedConstructor 
{
public static void main(String[] args)
{
System.out.println("main starts");
box b1=new box(10,20,30);
box b2=new box(10);
box b3=new box();
box b4=new box(b1);
b1.printDimention();
b2.printDimention();
b3.printDimention();
b4.printDimention();
System.out.println("main ends");
}
}


