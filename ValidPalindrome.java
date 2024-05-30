package first;
import java.util.Scanner;
public class ValidPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine().toLowerCase();
		char[] arr = str.toCharArray();
		
		String rev = "";
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if((arr[i] >= 95 && arr[i] <= 122) || (arr[i] >= 48 && arr[i] <= 57)) {
				rev += arr[i];
			}
		}
		
		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer(rev);
		sb.reverse();
		
		if(rev.equalsIgnoreCase(new String(sb)))
			System.out.println("is palindrome");
		else
			System.out.println("not palindrome");

	}

}
