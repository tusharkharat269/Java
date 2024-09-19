package objectOrientedPrograms;

//		Important keywords: super,final,this

class Transportaion {

	String type;

	void star() {
		System.out.println("start of transportaion..");
	}

	void startTravel() {
		System.out.println("Transportaion class start travel method");
	}

}

class vehicles extends Transportaion { // parent class

	int wheels;
	String brand;
	boolean mannual; // 0 , 1 for automated

	void print() {
		System.out.println(brand);
		System.out.println(wheels);
		System.out.println("Is mannual: " + mannual);
	}

	void start() {
		System.out.println("start of vehicles.........");
	}

}

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
