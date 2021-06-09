package corejava;

public class variable {
	
	static int a=100;// static method
	int b=200;  //instance method
	
	
	public void m1()
	{
		int data=100; // local variable
				System.out.println(data+a+b);
				System.out.println(a);
				System.out.println("local variable " +data);
				
	}
	
	static void m2()
	{
		int data1=500; // local variable
		System.out.println("i am in static method");
		System.out.println(data1+a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		variable vb= new variable();
		vb.m1();
		vb.b=700;
		m2();
		
		System.out.println("static variable " +a); // variable.a
		System.out.println("static variable " +variable.a);
		System.out.println("instance variable " +vb.b);
	}

}
