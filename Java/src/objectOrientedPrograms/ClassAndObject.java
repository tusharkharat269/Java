package objectOrientedPrograms;


class car{			// store in metadeta and logical entity
					// user defined data type
	
//	Properties
	int speed;
	String name;
	
//	method or behavious
	
	void drive() {
		System.out.println("car is driving......."+name+" "+speed);
	}
	
}

public class ClassAndObject {
	
	public static void main(String[] args) {
		car car1 = new car();		// physical entity , heap memory is allocated
		car car2 = new car();
		
		car1.speed = 100;
		car1.name = "BMW";
		System.out.println(car1.name+" "+car1.speed);
		car1.drive();
		
		car2.drive(); 		//car is driving.......null
	}

}
