package Chapter1.java;

public class Test8 {
static int x=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test7 t=new Test7();
Test7 y=new Test7();
Test7 s=new Test7();
s.x=t.x+5;
t.x=s.x+5;
System.out.println(t.x);

	

	}

}
