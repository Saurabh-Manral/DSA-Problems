package first;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class SummaryRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int first = arr[0], last = arr[0];
		String res = "";
		
		for(int i = 1; i < size; i++) {
			if(arr[i] == last + 1) {
				last = arr[i];
			} else {
				res += (first + "->" + last + ", ");
				first = arr[i];
				last = arr[i];
			}
		}
		res += (first + "->" + last);
		System.out.println(res);
	}
}
