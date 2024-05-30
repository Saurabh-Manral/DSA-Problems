package first;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ThreeSumExtnd {
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
		
		//actual code
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			int ele = arr[i], count = 1;
			while((target - (ele*count)) != 0 && (ele*count) < target) {
				int k = search(arr, 0, size - 1, target - (ele*count));
				
				if(k == -1) {
					count++;
				} else {
					ArrayList<Integer> al = new ArrayList<>();
					for(int j = 0; j < count; j++)
						al.add(ele);
					
					al.add(arr[k]);
					
					res.add(al);
				}
			}
		}
		
		System.out.println(res);
	}
	
	public static int search(int[] arr, int f, int l, int ele) {
		
		if(f > l) {
			return -1;
		}
		
		int mid = (f + l) / 2;
		
		if(arr[mid] == ele) {
			return mid;
		}
		else if(arr[mid] < ele) {
			return search(arr, mid + 1, l, ele);
		} else {
			return search(arr, f, mid - 1, ele);
		}
	}
}
