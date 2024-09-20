package objectOrientedPrograms.polymorphism;

class trees {
	String name;
	int count;

	public trees(String name, int count) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.count = count;
	}

	@Override
	public String toString() {
		return "print : " + name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		trees that = (trees) obj;
		if (this.name == that.name) {
			return true;
		}

		return false;
	}
}

public class ObjectClass {

	public static void main(String[] args) {

		trees objTrees = new trees("mango", 20);
		trees obj2 = new trees("mango", 20);

		System.out.println(objTrees); // objectOrientedPrograms.polymorphism.trees@7e0ea639
		System.out.println(objTrees.toString()); // same thing print
//		print : null
//		print : null

		System.out.println(objTrees.equals(obj2));
		System.out.println(obj2.hashCode()); 				// unique identity code
		System.out.println(obj2.getClass());				// class objectOrientedPrograms.polymorphism.trees

	}

}
