package first;
import java.util.Arrays;
import java.util.Scanner;
public class ThreeSumClosest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target element");
		int target = sc.nextInt();
		
		//Actual code
		Arrays.sort(arr);
		int curr = 0, f = 0, l = 0, diff = Integer.MAX_VALUE;
		for(int i = 0; i < size - 2; i++) {
			curr = arr[i];
			f = i + 1;
			l = size - 1;
			//two-pointer algorithm
			while(f < l) {
				int temp = curr + arr[f] + arr[l];
				
				if(Math.abs(temp - target) < Math.abs(diff - target)) {
					diff = temp;
				}
				
				if(temp > target) {
					l--;
				} else
					f++;
			}
		}
		
		System.out.print(diff);
	}
}
