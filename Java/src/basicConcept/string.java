package basicConcept;

public class string {
	
	public static void main(String[] args) {
		
		String str = "  Learn java with tvk";  // by literal
//		String str1 = new String("Learn java with TK");  //this is referance memory, immutable
		char c[] = {'a','b','c'};
		
		System.out.println(str);
//		System.out.println(str);			// Learn java with TK

		System.out.println(str.charAt(4));
		System.out.println(c);
		System.out.println();
		
		System.out.println("3"+"9"); // 39 is String
		
		
		String str2 = "tvk";
		System.out.println(str.trim());
		System.out.println("dsjfsd".endsWith("sd"));
		
		for (String word : str.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(str.endsWith(str2));
		System.out.println(str.contains(str2));
			
	}
}
