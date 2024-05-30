package first;
import java.util.Scanner;
public class ThirdMaximum {
	public static void main(String[] args) {
		
		System.out.println(Integer.MIN_VALUE);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		
//		System.out.println("Enter the elements of the array: ");
//		for(int i = 0; i < size; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		//actual code
//		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
//		
//		for(int i : arr) {
//			if(first < i) {
//				third = second;
//				second = first;
//				first = i;
//			} else if(second < i && i != first) {
//				third = second;
//				second = i;
//			} else if(third < i && i != second && i != first) {
//				third = i;
//			}
//		}
//		
//		if(third == Integer.MIN_VALUE) {
//			System.out.println("Third minimum doesn't exist");
//			System.out.println("Therefore maximum value present in the array is: " + first);
//		} else {
//			System.out.println("The third maximum value is: " + third);
//		}
	}
}
