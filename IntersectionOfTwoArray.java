package first;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		
		//reading first array element
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of second array: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements of second array: ");
		
		//reading second array element
		for(int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int count = -1;
		for(int i : arr2) {
			hm.put(i, i);
		}
		for(int i : arr) {
			if(hm.containsKey(i)) {
				arr2[++count] = hm.remove(i);
			}
		}
		int[] res = new int[count + 1];
		for(int i = 0; i <= count; i++) {
			res[i] = arr2[i];
		}
		
		for(int i : res) {
			System.out.print(i + " ");
		}
		
	}
	
	
}
