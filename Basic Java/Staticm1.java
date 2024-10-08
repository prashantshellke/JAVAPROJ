package Assignment;
//static method
public class Staticm1 {
private static int numInstances=0;
protected static int getCount()
{
	return numInstances;
	
}
private static void addInstance()
{
	numInstances++;
	}
Staticm1()
{
Staticm1.addInstance();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Starting with" + Staticm1.getCount() +"instances");
for(int i = 0;i < 500; ++i)
{
	new Staticm1();
	
}
System.out.println("Created"+Staticm1.getCount()+"instances");
	}

}
