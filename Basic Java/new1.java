package chap1;

public class new1 {
	private int rollno;
	private String name;
	private float fee;
	

	public new1(int rollno,String name,float fee) {
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
public void display() {
	System.out.println(rollno+"  "+name+"  "+fee);
}
public static void main(String args[])
{
	new1 s1=new new1(111,"ankit",39142);
	s1.display();
}
}