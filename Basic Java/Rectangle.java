package Assignment;
public class Rectangle {
	int length;
	int breadth;
	//constructor initialize breadth and length of rectangle
Rectangle()
{
	length=5;
	breadth=6;
}
//method to calculate area of rectangle
int area()
{
	int rectArea=length*breadth;
	return rectArea;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle firstRect=new Rectangle();
System.out.println("Area of Rectangle:"+firstRect.area());
	
}
}


