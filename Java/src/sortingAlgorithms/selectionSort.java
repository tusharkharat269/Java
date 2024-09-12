package sortingAlgorithms;

//time complexity is O(N^2)

public class selectionSort {
	
	static 	void sort(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	public static void main(String[] args) {
		int arr[] = {48,25,69,74,1,3,7,45,25};

        sort(arr);
        
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
		
	}

}
