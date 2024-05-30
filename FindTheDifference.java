package first;
import java.util.Scanner;
public class FindTheDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string s: ");
		String s = sc.nextLine();
		System.out.println("Enter the string t: ");
		String t = sc.nextLine();
		
		int[] count = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			if(count[ch - 97] == 0) {
				System.out.println(ch);
				break;
			} else {
				count[ch - 97]--;
			}
		}
	}

}
