
package basicConcept;

import java.util.Scanner;

public class max_min {


    void insert()
    {

        int arr[] = new int[10];

        try (Scanner mysc = new Scanner(System.in)) {
            
            for (int i = 0; i < 10; i++) 
            {
                System.out.println("enter the no.");
                arr[i] = mysc.nextInt();

            }
        }
        
        
    }

    void max(int arr[])
    {
        //maximum element
        int max = arr[0];

        for (int j = 0; j < 10; j++) {

            if (arr[j] > max) {

                max = arr[j];
            }
            
        }

        System.out.println("maximum element : "+ max);

    }





    
    public static void main(String[] args) {
        

    max_min obj = new max_min();

    obj.insert();
    
        

    }
    
}
