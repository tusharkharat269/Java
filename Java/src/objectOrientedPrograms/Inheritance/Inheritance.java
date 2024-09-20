package objectOrientedPrograms.Inheritance;

//		Important keywords: super,final,this

public class Inheritance extends vehicles { // child class

	void start() {

//		super.start();
		System.out.println(this); // objectOrientedPrograms.Inheritance@6fadae
		System.out.println(this.brand + " car is starting");
//		this tells you that which object you currently belong to

//		System.out.println("car is starting ......... ");
	}

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();

		obj.wheels = 4;
		obj.brand = "hyundai";
		obj.mannual = false;
//		obj.print();

//		obj.startTravel(); 

		obj.start(); // function start() is overriding

//		with super 
//		start of vehicles.........
//		objectOrientedPrograms.Inheritance@6fadae
//		hyundai car is starting

	}

}
