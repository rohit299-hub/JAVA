package corejava;

public class Exceptionprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int data=100/0;
			System.out.println(data);
		}
		/*catch(Exception e)
		{
			System.out.println("number can not be divided by 0");
		}*/
		finally
		{
			System.out.println(" finally block executed");
		}

		System.out.println(" rest of the code");
	}

}
