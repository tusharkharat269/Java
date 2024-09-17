package basicConcept;

public class Operator {

	public static void main(String[] args) {

		// Bitwise operator
		int num = 9;

		System.out.println(Integer.toBinaryString(num));

		int lshift = num << 1;
		int rshift = num >> 1;

		System.out.println(Integer.toBinaryString(lshift) + " " + lshift);
		System.out.println(Integer.toBinaryString(rshift) + " " + rshift);

		System.out.println(Integer.toBinaryString(num >>> 2) + " " + (num >>> 2));

		// ternary
//		int num = 43;

//		int	val = 	(num > 10) ?	num 			: 	-1;
//			//		condition		true expression		false
//		
//		System.out.println(val);
	}

}
