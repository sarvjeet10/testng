package pack1;

public class castingPgm //program for casting
{
	public static void main(String[] args)
	{
		int i = (int)20.99;        //  narrowing is explicit it is mandotory to define the type in case of demotion.
		double j = 25;            // widening casting is implicit promtion is automatic 
		System.out.println(i);
		System.out.println(j);
	}
}