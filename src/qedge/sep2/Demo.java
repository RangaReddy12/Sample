package qedge.sep2;
public class Demo {
	//write void type method
	public static void division(int x, int y)
	{
		int z=x/y;
		System.out.println(z);
	}
	public static String verifyStrings(String str1,String str2)
	{
		String res="";
		if(str1.equals(str2))
		{
			res="Strings are Equal";
		}
		else
		{
			res="Strings are Not Equal";
		}
		return res;
	}
	//compare two integer values
	public static boolean comparevalues(int a, int b)
	{
		if(a==b)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	public static void main(String[] args) {
		Demo.division(6876, 8);
		String results=Demo.verifyStrings("India", "India");
		System.out.println(results);
		boolean r=Demo.comparevalues(100, 100);
		System.out.println(r);
	}
    }




