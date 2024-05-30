package first;
import java.util.Scanner;
import java.util.HashMap;
public class ContainsDuplicate2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		System.out.println("Enter the value of K:");
		int k = sc.nextInt();
		int[] arr = new int[size];
		HashMap<Integer, Integer> hm = new HashMap<>();
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			if(hm.containsKey(arr[i]) && Math.abs(hm.get(arr[i]) - i) == k) {
				System.out.println("true");
			} else {
				hm.put(arr[i], i);
			}
		}
	}
}
