package first;
import java.util.Scanner;
public class ConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//actual code
		int i = -1, j = 0, count = 0;
		while(j < size) {
			if(i == -1) {
				if(arr[j] == 1)
					i = j;
			} else {
				if(arr[j] == 0) {
					int val = j - i;
					if(count < val)
						count = val;
					
					i = -1;
				}
			}
			j++;
		}
		if(i != -1) {
			int val = j - i;
			if(count < val)
				count = val;
		}
		
		System.out.println("The total number of consecutive ones is : " + count);
	}
}
