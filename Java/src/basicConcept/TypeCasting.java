package basicConcept;

public class TypeCasting {
	public static void main(String[] args) {
		
		int age = 45;

		int bit = (int) Integer.valueOf(Integer.toBinaryString(age));

//		System.out.println((byte) studentAge);
//		System.out.println(BigInteger.valueOf(studentAge));
		System.out.println(bit);
	}
}
