package first;
import java.util.Scanner;
public class MovingZeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//actual solution
		int first = 0, last = size - 1;
		int[] res = new int[size];
		for(int i = 0; i < size; i++) {
			if(arr[i] == 0) {
				res[last--] = 0;
			} else {
				res[first++] = arr[i];
			}
		}
		
		arr = res;
		System.out.println("\nResult is: ");
		for(int i : arr)
			System.out.print(i + " ");
	}
}
