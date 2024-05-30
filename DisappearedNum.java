package first;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
public class DisappearedNum {
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
		int ind = -1;
		for(int i = 0; i < size; i++) {
			if(arr[i] > size) {
				ind = (arr[i] - size) - 1;
			} else {
				ind = arr[i] - 1;
			}
			
			if(arr[ind] <= size)
				arr[ind] += size;
		}
		
		List<Integer> res = new LinkedList<>();
		
		for(int i = 0; i < size; i++) {
			if(arr[i] <= size) {
				res.add(i + 1);
			}
		}
		
		System.out.println(res);
	}

}
