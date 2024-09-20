package objectOrientedPrograms.Inheritance;

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
