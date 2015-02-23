//Bruce Anderson 
//inserting comments for cmp112test-1 feb 23 2015
// class name Car


public class Car {
	public String make; 
	public int year; 

//this top part is the data or state
/*--------------------------------------------------------------------------*/
//this bottom part is the behavior

Car () {
	make = "Unknown"; 
	year = 2015; 
	}
//this section sets the parameters for the class
	
Car (String thisMake) {
	this (); 
	make = thisMake;
	}
//this section calls the method "Make" with the word "this"

Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear; 	
	}
//this section calls the method "Year" with the word "this"

public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
//this section prints out the data by using "toString"
