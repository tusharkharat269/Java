package objectOrientedPrograms;

class bike { 
	
	int speed;
	String name;
	
//	Constructor
//	Initialize the variables by using constructor
	
	public bike() {
		// TODO Auto-generated constructor stub
		name = "suzuki";
		speed = 200;
		
		System.out.println("constructor is calledd......."+name+"  "+speed);
	}
	
	public bike(int speed,String name) {
		
//		this pointing to variable of that class
//		removes ambiguity
		
		this.name = name;
		this.speed = speed;
		
		System.out.println("constructor with parameters is calledd......."+name+"  "+speed);
	}



	void drive() {
		System.out.println("bike is driving......." + name + " " + speed);
	}

}

public class Constructor {
	
	public static void main(String[] args) {
		bike b1 = new bike();		//constructor is calledd.......suzuki  200
		
		bike b2 = new bike(150,"yamaha");		//constructor with parameters is calledd.......yamaha  150
		
		
	}

}
