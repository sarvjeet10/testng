package pack1;

class emp
{
String name;
int id;
static int count=0;
emp(String name,int id)
{
this.name=name;
this.id=id;
count++;
}
}
public class constructorPgm2{	
public static void main(String[] args){
emp e1=new emp("Sarvjeet",100);
emp e2=new emp("Singh",101);
System.out.println(e1.name+":"+e1.id);
System.out.println(e2.name+":"+e2.id);
System.out.println("Total Employee:"+emp.count);
}
}