package Chapter1.java;

public class Student {
	private int rollno;
	private String name;
	private float fee;
	public Student (int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	public void display()
	{
		System.out.println(rollno+""+name+""+fee);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(11,"ankit",5000);
s1.display();
	}

}
