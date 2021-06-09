package Arraydemo;

public class SingleArraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int [5];
		
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		
		System.out.println("VALUE OF GIVEN ARRAY IS " +a[3]);
		
		System.out.println("AARAY A VALUES of  ARE : " );
		
		for (int i=0;i<a.length;i++)
		{
		
			System.out.println(a[i]);
		}

		//second way to define single array
		
		int b[] = {21,22,23,24,25,26};
		
		System.out.println("AARAY B VALUES of  ARE : " );
		
		for (int i=0;i<b.length;i++)
		{
		
			System.out.println(b[i]);
		}
		
		
	}
	
}
