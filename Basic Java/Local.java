package chap1;

public class Local {
	public void age()
	{
		int age=5;
		age=age+6;
		System.out.println("Age is :"+age);
	}
	public static void main(String[] args) {
		Local t=new Local();
		
		t.age();
	
	}

}
