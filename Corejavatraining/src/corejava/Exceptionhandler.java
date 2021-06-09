package corejava;


//Exception is an abnormal condition.
//an exception is an event that disrupts the normal flow of the program
//The Exception Handling in Java is one of the powerful 
//mechanism to handle 
//the runtime errors so that normal flow of the application 
//can be maintained.
//Types of Java Exceptions
//
// 1.Checked Exception
// 2.Unchecked Exception
/*try	The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.
catch	The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.
finally	The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.*/

public class Exceptionhandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int data=100/0;
			System.out.println(data);
		}catch(Exception e)
		{
			System.out.println("number can not be divided by 0");
		}
		finally
		{
			System.out.println(" block executed");
		}

		System.out.println(" rest of the code");
	}

}
