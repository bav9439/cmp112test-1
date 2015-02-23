public class Phone {
	public String make; 
	public String model;
	public int quantity; 
	}

/*---------------------------------------------------------------*/	

Phone () {

	make = "Unknown";
	model = "Unknown";
	quantity = 2010; 
	}


	
Phone (String thisMake) {
	this (); 
	make = thisMake; 
	}

Phone (String thisMake, String thisModel) {
	make = thisMake;
	model = thisModel; 
	}





Phone (String thisMake, String thisModel,  int thisYear) {
	make = thisMake;
	model = thisModel
	year = thisYear; 
	}

public String toString () {
	String output = ""; 
	output = "Make: " + make + " Model: " + model + " Year: " + year;
	return output;
	}
}  
