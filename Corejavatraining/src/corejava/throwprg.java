package corejava;

//The Java throw keyword is used to explicitly throw an exception.

//We can throw either checked or unchecked exception in java by throw
	//keyword. The throw keyword is mainly used to throw custom exception

public class throwprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=03;
		if(age<18)
		{
			throw new ArithmeticException("Age is not a valid for vote");
		}
		else
		{
			System.out.println("welcome to vote");
		}
		System.out.println("rest of the code...");
	}


}
