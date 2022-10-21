package qedge.aug30;
public class Demo1 {
public static void main(String[] args) {
		// divide any thing with zero
		try {
		int x=2345,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
			//t.printStackTrace();
		}
		//division
		double a=3443,b=87,c;
		c=a/b;
		System.out.println(c);
	}
}
