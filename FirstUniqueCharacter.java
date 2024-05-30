package first;
import java.util.Scanner;
public class FirstUniqueCharacter {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int[] count = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(count[str.charAt(i) - 97] == 1)
				System.out.println(i);
		}
		
		//print -1 otherwise
	}
		
}

