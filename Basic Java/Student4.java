package Assignment;
//constructor overloading
public class Student4 {
int id;
String name;
int age;
Student4(int i,String n)
{
	id=i;
	name=n;
	}
Student4(int i,String n,int a)
{
	id =i;
	name=n;
	age=a;
}
void display()
{
	System.out.println(id+" "+name+" "+age);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student4 s1=new Student4(1,"kamil",22);
Student4 s2=new Student4(2,"Prajakta",20);
s1.display();
s2.display();
	}

}
