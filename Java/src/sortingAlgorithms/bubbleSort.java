package sortingAlgorithms;

public class bubbleSort {
	
	// Time Complexity: O(N2)
	
	static void sort(int arr[])
    {
        int i, j, temp;
        int n = arr.length;
        
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    // Swap element
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
	
	public static void main(String[] args) {
		int arr[] = {48,25,69,74,1,3,7,45,25};

        sort(arr);
        
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
		
	}
}
