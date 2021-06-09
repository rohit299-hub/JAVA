package Arraydemo;

public class Multidimension {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int [3][3];
		
		a[0][0]=50;
		a[0][1]=40;
		a[0][2]=30;
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=60;
		a[2][0]=70;
		a[2][1]=90;
		a[2][2]=80;
		
		//System.out.println(a[2][2]);
		
		int b[][]= {{1,4,5},{2,9,7},{21,23,25}};
		
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.println(b[i][j]);
			}
		}
		
	}

}
