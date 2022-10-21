package qedge.aug29;
public class TwoDimension {
public static void main(String[] args) {
		// store login data into array
		String login[][]= new String [4][2];//four rows and two cells
		//first row first cell data
		login[0][0]="Admin1";
		//first row second cell data
		login[0][1]="Test1";
		//second row first cell data
		login[1][0]= "Admin2";
		//second  row second cell data
		login[1][1]="Test2";
		//third row first cell data
		login[2][0]="Admin3";
		//third row second cell data
		login[2][1]="Test3";
		//fourth row first cell data
		login[3][0]="Admin4";
		//fourth row second cell data
		login[3][1]="Test4";
		//print row length
		System.out.println(login.length);
		//print first row cell lenght
		System.out.println(login[0].length);
		System.out.println(login[3][0]);
		//iterate all rows
		for(int i=0;i<login.length;i++)
		{
			//iterate each row cell
			for(int j=0;j<login[i].length;j++)
			{
				System.out.print(login[i][j]+"\t");
			}
			System.out.println();
		}
	}
  }








