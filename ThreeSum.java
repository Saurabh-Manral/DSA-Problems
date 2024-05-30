package first;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ThreeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//actual code
		Arrays.sort(arr);
		List<List<Integer>> res = new ArrayList<>();
		
		for(int i = 0; i < size - 3; i++) {
			int f = i + 1, j = size - 1, target = arr[i] * -1;
			
			while(f < j) {
				if((arr[f] + arr[j]) == target) {
					ArrayList<Integer> al = new ArrayList<>();
					al.add(arr[i]);
					al.add(arr[f]);
					al.add(arr[j]);
					
					if(!res.contains(al)) {
						res.add(al);
					}
					f++;
					j--;
				} else if(arr[f] + arr[j] < target) {
					f++;
				} else {
					j--;
				}
			}
		}
		
		System.out.println(res);
	}
}
