package objectOrientedPrograms.abstraction;			

// define structures of class
//	cannot create object of the class
// reuse of code

abstract class vehical{

//	 method don't have body,
//	single abstract method makes whole class abstract
	abstract int speed();	
	
//	concrete  method
	
	void print() {
		System.out.println("print from abstrac classs......");
	}
}

class car extends vehical{

	@Override	// this is called annotations, basically use to check spelling of functions
	int speed() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	void print() {
		System.out.println("print from car class......");
	}
	
}

public class LearnAbstract {
	
	public static void main(String[] args) {
		
//		vehical objVehical = new vehical(); 		not possobles
		
		
		car objCar = new car();
		
		System.out.println(objCar.speed());
		
		objCar.print(); 			//print from car class......
		
	}

}
