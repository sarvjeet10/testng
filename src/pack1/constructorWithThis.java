package pack1;

class box1
{
int length;
int width;
int height;
String color;
box1()
{
	System.out.print("Heloo");
}
box1(int l,int w,int h)
{
length=l;
width=w;
height=h;
}
box1(int l,int w,int h,String c)
{
this(l,w,h);
color=c;
}
}
public class constructorWithThis{
public static void main(String[] args){
System.out.println("main starts");
box1 b1 = new box1(10,20,30,"red");
System.out.println("Length:"+b1.length+", Width:"+b1.width+", Height:"+b1.height+", Color:"+b1.color);
System.out.println("main ends");
}
}