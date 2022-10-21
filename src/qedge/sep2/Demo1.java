package qedge.sep2;
public class Demo1 {
public static void main(String[] args) {
		String str= "Welcome into Very Wonderfull Selenium world";
		String var[]=str.split("Very");
		for (String each : var) {
			System.out.print(each);
		}
		
}

}
