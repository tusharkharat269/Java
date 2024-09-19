package objectOrientedPrograms.encapsulation.MainPackage;

public class person {
	
	private String personName;
	private Integer mobileNo;
	private int age;
	

	public String getName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0) {
			this.age = age;

		}
	}
	
	public static void main(String[] args) {
		
		person objPerson = new person();
		objPerson.personName = "tvk";
		objPerson.mobileNo = 888444814;
		
		
		
	}

}
