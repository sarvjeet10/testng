package pack1;

class rectangle
{
int len;
int brd;
void intialization(int len,int brd)
{
this.len=len;
this.brd=brd;
}
}
public class glbVarPgm{
public static void main(String[] args){
rectangle r1=new rectangle();
r1.intialization(10,20);
System.out.println("Length:"+r1.len+", Bredth:"+r1.brd);
rectangle r2=new rectangle();
r2.intialization(100,200);
System.out.println("Length:"+r2.len+", Bredth:"+r2.brd);
}
}
