package objectOrientedPrograms.abstraction;

// interfaces are similar to abstract class
// it allows multiple inheritance

interface humans{
	
	int age = 10; // it is consider ad public static final in interface
	
//	void print();
	
	default void print() {
//			avoids true abstraction
		System.out.println("form humanss........");
	};
}

interface animals{
//	void print();
	
	
}

public class LearnInterface implements humans,animals{

//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println("from learnIntefaces..........");
//		
//	}
	
	
	public static void main(String[] args) {
		
		LearnInterface objInterface = new LearnInterface();
		
		objInterface.print();
	
	}

}
