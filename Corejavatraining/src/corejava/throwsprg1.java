package corejava;



public class throwsprg1 {
	
	public void m1() throws InterruptedException
	{
		m2();
	}
	public void m2() throws InterruptedException
	{
		m3();
	}
	public void m3() throws InterruptedException
	{
		m4();
	}
	public void m4() throws InterruptedException
	{
		m5();
	}
	public void m5() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("hello");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		throwsprg1 t = new throwsprg1();
		
		t.m1();

	}

}
