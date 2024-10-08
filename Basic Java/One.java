package Assignment;

	// Java program to illustrate the
	// concept of single inheritance
	import java.io.*;
	import java.lang.*;
	import java.util.*;

	// Parent class
	class One {
	    public void print_geek()
	    {
	        System.out.println("Geeks");
	    }
	}

	class Two extends One {
	    public void print_for() { System.out.println("for"); }
	}

	