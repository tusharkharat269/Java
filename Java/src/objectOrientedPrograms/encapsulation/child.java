package objectOrientedPrograms.encapsulation;

class child extends parent{
	
//	private: 		only access to class
//	default : 		package protected , available in package
//	protected : 	default + subclass with different package
//	public : 		anyone can access it from anywhere
	

	
	public static void main(String[] args) {
		
		child obj = new child();
		
//		obj.name = "dfsdsf"; 		cannot access names
		obj.mobileNo = 5446841;			// default is accessible
		obj.address = "buldana";		//accessibles
		
//		car
		
	}

}
