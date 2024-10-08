
package chap1;

import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {  
		
		Scanner in =new Scanner(System.in);
		int daynum;
		System.out.println("Pls enter the num[1-7]");
		daynum=in.nextInt();
	    switch(daynum){  
	    case 1: System.out.println("sunday");  
	    break;  
	    case 2: System.out.println("Monday");  
	    break;  
	    case 3: System.out.println("Tuesday");  
	    break; 
	    case 4: System.out.println("Wedsday");  
	    break; 
	    case 5: System.out.println("Thresday");  
	    break;  
	    case 6: System.out.println("friday");  
	    break;  
	    case 7: System.out.println("saturday");  
	    break;  
	    default:System.out.println("see in calender");  
	    }  
	}  

}
