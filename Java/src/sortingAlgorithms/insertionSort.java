package sortingAlgorithms;

// Time complexity O(n^2)

public class insertionSort {
	
	static void sort(int arr[])
    {
        int n = arr.length;
        
        for (int i = 1; i < n; ++i) {
        	
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {48,25,69,74,1,3,7,45,25};

        sort(arr);
        
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }

}
