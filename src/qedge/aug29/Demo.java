package qedge.aug29;

public class Demo {

	public static void main(String[] args) {
		// store login data into array
				Object login[][]= new Object [4][2];//four rows and two cells
				//first row first cell data
				login[0][0]="Admin1";
				//first row second cell data
				login[0][1]=52478;
				//second row first cell data
				login[1][0]= "Admin2";
				//second  row second cell data
				login[1][1]=54789;
				//third row first cell data
				login[2][0]="Admin3";
				//third row second cell data
				login[2][1]=32145;
				//fourth row first cell data
				login[3][0]="Admin4";
				//fourth row second cell data
				login[3][1]=54789;
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
