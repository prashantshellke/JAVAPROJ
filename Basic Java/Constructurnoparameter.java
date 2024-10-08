package Assignment;

public class Constructurnoparameter {
	

		  int i;

		  // constructor with no parameter
		  private Constructurnoparameter() {
		    i = 5;
		    System.out.println("Constructor is called");
		  }

		  public static void main(String[] args) {

		    // calling the constructor without any parameter
		    Constructurnoparameter obj = new Constructurnoparameter();
		    System.out.println("Value of i: " + obj.i);
		  }
		




	}


