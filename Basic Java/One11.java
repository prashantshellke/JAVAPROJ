package Assignment;
import java.io.*;
import java.lang.*;
import java.util.*;

public class One11 {
	// Importing required libraries
	
	// Parent class One
	    // Method to print "Geeks"
	    public void print_geek() {
	        System.out.println("Geeks");
	    }
	

	// Child class Two inherits from class One
	class Two extends One11 {
	    // Method to print "for"
	    public void print_for() {
	        System.out.println("for");
	    }
	}

	// Child class Three inherits from class Two
	class Three extends Two {
	    // Method to print "Geeks"
	    public void print_lastgeek() {
	        System.out.println("Geeks");
	    }
	}
}
	

	
	