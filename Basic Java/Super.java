package chap1;

public class Super {

	int xy=100;
		
	}
	class subclass extends Super{
		int xy=200;
		void display() {
			System.out.println("super class xy:"+super.xy);
			System.out.println("sub class xy:"+xy);
			
		}}
		