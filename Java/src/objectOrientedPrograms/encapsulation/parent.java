package objectOrientedPrograms.encapsulation; // binding of methods and variables , achieve data hiding 

class parent {
	
	int mobileNo;			// default
	private String name;
	protected String address; 	// subclass in differnt package can access it
	

	public static void main(String[] args) {

		parent obj = new parent();

		obj.name = "dfsdsf";
		System.out.println(obj.name);

	}

}
