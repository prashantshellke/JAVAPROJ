package Assignment;
//this keyword
public class This {
int height;
int breadth;
int length;
void show(int length,int breadth)
{
	this.length=length;
	this.breadth=breadth;
}
int calculate()
{
return(length*breadth);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
This rectangle=new This();
rectangle.show(8, 6);
int area=rectangle.calculate();
System.out.println("The area of a Rectangle is" +area);
	}
}



