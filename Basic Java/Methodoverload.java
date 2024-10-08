package Assignment;

public class Methodoverload {
int m,n;
Methodoverload()
{
	m=5;
	n=28;
}
Methodoverload(int p,int q)
{
	m=p;
	n=q;
}
Methodoverload(double x,double y)
{
	m= (int)x;
	n=(int)y;
}
void display()
{
	System.out.println(m);
	System.out.println(n);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodoverload ob1=new Methodoverload();
Methodoverload ob2=new Methodoverload(10,5);
Methodoverload ob3=new Methodoverload(25.6,80.5);
ob1.display();
ob2.display();
ob3.display();
	}

}
