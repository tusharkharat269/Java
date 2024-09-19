package objectOrientedPrograms.encapsulation;


public class KeywordStatic {
	
//	keywordd final: crates constant varibles , never changed,not modified
	double pInteger = Math.PI;
	
	public static int count;
	
	static {
		// first executions
		// executes when the class created
		System.out.println("static blocked called.....");
		
	}
	
	public KeywordStatic() {
		count++;
		// TODO Auto-generated constructor stub
	}
	
	static String staticNameString;  		//single copy of variables with class creation	, 
//												memory allocated without object create
	
	
	public static void print() {	
//		access this method in class without class object
		System.out.println("printing withod creadting object of class");
	}
	
	public static void main(String[] args) {
		
		print();
		
		staticNameString = "dsfdfsdfs";				// dsfdfsdfs
		
		System.out.println(staticNameString);
		
		KeywordStatic objKeywordStatic = new KeywordStatic();
		objKeywordStatic.staticNameString = "4546sd544";
		System.out.println(objKeywordStatic.staticNameString);
		
		System.out.println(staticNameString); 		//4546sd544
		
		
		KeywordStatic o1 = new KeywordStatic();
		KeywordStatic o2 = new KeywordStatic();
		
		System.out.println(count);		//3

	}

}
