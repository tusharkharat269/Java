package arrays;

public class array_2D {
	
	public static void main(String[] args) {
		
		int[][] arr = { {1, 2, 3, 4}, {5, 6}};
		
		System.out.println(arr[1][0]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for (int[] row : arr) {
			  for (int i : row) {
			    System.out.print(i);
			  }
			  System.out.println();
			}
		
		
	}
}
