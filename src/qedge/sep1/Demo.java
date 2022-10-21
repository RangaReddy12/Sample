package qedge.sep1;
public class Demo {
	//global variable
	 int a,b,c;
	double x,y,z;
	public  void addition()
	{
		a=87654;
		b=87;
		c=a+b;
		System.out.println(c);
	}
	public void division()
	{
		x=3456;
		y=87;
		z=x/y;
		System.out.println(z);
	}
	public void sub()
	{
		a=4567;
		b=987;
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		//create reference object to call non static methods
		Demo x = new Demo();
		x.division();
		x.addition();
		x.sub();
	}
}