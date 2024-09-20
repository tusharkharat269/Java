package objectOrientedPrograms.polymorphism;

class parent {
	public void runtime() {
		System.out.println("runtime from parent.....");
	}
}

class child extends parent {

	public void runtime() {

		System.out.println("runtime form child class ...........");
	}
	
	

	public void compileTime() {
		System.out.println("comile time without parameters");
	}

	public void compileTime(int val) {

		System.out.println("comile time with int variable" + val);
	}
}

public class PolymorphismConcept {

	public static void main(String[] args) {

		// runtime polymorphism, Method Overriding
		parent objChild = new child();				//only parents method are accessible

		objChild.runtime(); // runtime form child class ...........

		
		
//		compile time polymorphism , Method Overloading of functions, functions check on compile time
		child objChild2 = new child();

		objChild2.compileTime(); // comile time without parameters
		objChild2.compileTime(156); // comile time with int variable156

	}

}
