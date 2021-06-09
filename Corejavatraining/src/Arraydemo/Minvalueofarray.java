package Arraydemo;

public class Minvalueofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int b[][]= {{1,4,5},{2,9,7},{21,23,25}};

int min =b[2][2];
int max=b[0][0];
		
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				
				
			if(b[i][j]<min)
			{
				min=(b[i][j]);
			}
		}
	}
		System.out.println("min number " +min);
		//for maximum value of array
		
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<3; j++)
			{
				
				
			if(b[i][j]>max)
			{
				max=(b[i][j]);
			}

}
}System.out.println("max number " +max);
	}
}
