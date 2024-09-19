package objectOrientedPrograms.encapsulation;

import objectOrientedPrograms.encapsulation.KeywordStatic;


class Neighbour {

	public static void main(String[] args) {
		
		parent objParent = new parent();
		
//		objParent.name = "dfsdsf"; 		cannot access names
		objParent.mobileNo = 5446841;			// default is accessible , same package
		System.out.println(objParent.mobileNo);
		
		
		KeywordStatic.print(); 	// beacause we are in differnt class, class reference is required
	}
}
