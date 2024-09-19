package objectOrientedPrograms.encapsulation.DataHidding;

import objectOrientedPrograms.encapsulation.MainPackage.*;

public class HideData {
	
//	 we trying to access person in MainPackage
//	 but varibale name and no are privates
	
	public static void main(String[] args) {
		
		person objPerson = new person();
//		objPerson.name 					not accsesable
		
		objPerson.setPersonName("tushar");
		System.out.println(objPerson.getName());		// print tushar
		
		objPerson.setAge(-25);
		System.out.println(objPerson.getAge()); 		//print 0
		
	}

}
