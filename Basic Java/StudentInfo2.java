package Assignment;

public class StudentInfo2 {
	int rollno;
	int marks1;
	int marks2;
	int total;
	StudentInfo2(int roll_no,int m1,int m2)//parameterized constructor
	{
		rollno=roll_no;
		marks1=m1;
		marks2=m2;
	}
//method to calculate total
	int Total()
	{
		total=marks1+marks2;
		return total;
	}
	//method to display the result
	void displayResult()
	{
		System.out.println("Roll no of student is " +rollno);
		System.out.println("marks1 are"   + marks1);
		System.out.println("marks2 are"  +marks2 );
		System.out.println("total is"  +total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
int total1,total2,grandtotal;
StudentInfo2 student1=new StudentInfo2(1,50,80);
StudentInfo2 student2=new StudentInfo2(2,40,60);
total1=student1.Total();
total2=student2.Total();
grandtotal=total1+total2;
student1.displayResult();
student2.displayResult();
System.out.println("Grand Total is"  +grandtotal);
	}

	}
}

