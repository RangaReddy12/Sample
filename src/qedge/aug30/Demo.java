package qedge.aug30;
import java.util.ArrayList;
public class Demo {
public static void main(String[] args) {
		// store collection of cars
		ArrayList<String> cars = new ArrayList<String>(); 
		cars.add("Tata");
		cars.add("BMW");
		cars.add("Maruthi");
		cars.add("Mahindra");
		cars.add("Honda");
		cars.add("KIA");
		//print array list collection size
		System.out.println(cars.size());
		//print second position value in array list
		System.out.println(cars.get(1));
		//iterate all values in collection 
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
     	}
        }










