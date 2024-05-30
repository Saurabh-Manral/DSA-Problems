package first;
import java.util.Scanner;
public class IsSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string s: ");
		String s = sc.nextLine();
		System.out.println("Enter the string t: ");
		String t = sc.nextLine();
		
		char[] arr = t.toCharArray();
		
		int i = 0, j = 0;
		
		while(i < s.length() && j < arr.length) {
			if(s.charAt(i) == arr[j]) {
				i++;
				j++;
			} else {
				j++;
			}
		}
		
		if(i == s.length())
			System.out.println("true");
		else
			System.out.println("false");
	}

}
