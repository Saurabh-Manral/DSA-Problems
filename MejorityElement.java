package first;
import java.util.Scanner;
import java.util.HashMap;
public class MejorityElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int candidate = 0, vote = 0;
		for(int i = 0; i < size; i++) {
			if(i == 0) {
				candidate = arr[i];
				vote = 1;
			} else {
				if(arr[i] == candidate) {
					vote++;
				} else {
					vote--;
					if(vote == 0) {
						candidate = arr[i];
					}
				}
			}
		}
		int count = 0;
		for(int i = 0; i < size; i++) {
			if(arr[i] == candidate) {
				count++;
			}
		}
		
		if(count > size/2) {
			System.out.println(candidate);
		} else {
			System.out.println("There is no candidate key exist");
		}
	}
}
