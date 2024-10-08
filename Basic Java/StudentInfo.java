package Assignment;

public class StudentInfo {
	int rollno;
	int marks1;
	int marks2;
	int total;
	StudentInfo()//no argument default constructor
	{
	rollno=2;
	marks1=30;
	marks2=40;
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
			System.out.println("rollno of student is" + rollno);
			System.out.println("marks1 are" +marks1);
			System.out.println("marks2 are" +marks2);
			System.out.println("total is" +total);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int total1,total2,grandtotal;
			StudentInfo student1=new StudentInfo();
			StudentInfo student2=new StudentInfo();
			total1=student1.Total();
			total2=student2.Total();
			grandtotal=total1+total2;
			student1.displayResult();
			student2.displayResult();
			System.out.println("Grand Total is"+grandtotal);
			
		}
	}
	}


