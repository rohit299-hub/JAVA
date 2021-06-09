package corejava;


import java.util.*;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		//String a="ROHIT";
		String t="";
		
		for(int i=a.length()-1; i>=0;i--)
		{
			//System.out.println(a.charAt(i));
			
			t=t+(a.charAt(i));
			
			
		}
		System.out.println(t);
		System.out.println(a);
	if(t==a)
	{
		System.out.println("palindrome");
	}
	else
	{
    System.out.println("not a palindrome");
	}

	}
}
	
	
	
	


