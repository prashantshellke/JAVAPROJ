package chap1;

public class Instance {
static int y=20;
int x=25;
public void main() {
	
    int a=10;
    System.out.println();
    
    }
    public static void main(String[]args) {
    	 Instance t=new Instance();
  Instance s=new Instance();
  Instance i=new Instance();
//System.out.println(x);
  System.out.println(s.x);
  System.out.println(t.x);
  System.out.println(Instance.y);
  System.out.println(y);
 
  
}
}