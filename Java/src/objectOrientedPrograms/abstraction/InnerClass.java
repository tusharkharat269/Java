package objectOrientedPrograms.abstraction;

public class InnerClass {
	
	class NestedClass{
		
		String str;
		
	}
	
	static class n2{
		String string;
	}
	
//	annonymus class
	
	NestedClass annoClass = new NestedClass(){
		
		void annoMethod() {
			
		}
	};

	
	public static void main(String[] args) {
		NestedClass objClass = new InnerClass(). new NestedClass();
		n2 obj = new InnerClass.n2();
		
		objClass.str = "nested class string";
		
		
		 
		
		
	}

}
