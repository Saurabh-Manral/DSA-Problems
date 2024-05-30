package impquestions;

import java.util.List;
import java.util.Scanner;

public class Maximum_Subarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0, max = 0;
		
		for(int i = 0; i < size; i++) {
			sum += arr[i];
			
			if(sum > max) {
				max = sum;
			}
			
			if(sum < 0)
				sum = 0;
		}
		
		System.out.println("The maximum sum in the array is: " + max);
		
		
	}

}
