package Chapter1.java;

public class Test5 {
	int x=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test5 t=new Test5();
Test5 s=new Test5();
Test5 y=new Test5();
s.x=t.x+5;
t.x=s.x+5;
System.out.println(t.x);
	}

}
