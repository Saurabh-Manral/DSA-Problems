package first;
import java.util.Scanner;
import java.util.HashMap;
public class ContainsDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < size; i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			} else {
				int count = hm.get(arr[i]);
				if(count >= 1) {
					System.out.println("true");
					break;
				} else {
					hm.put(arr[i], count + 1);
				}
			}
		}
		
	}
}
