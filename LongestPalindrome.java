package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class LongestPalindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		
		String str = br.readLine();
		
		int[] count = new int[52];
		
		boolean sing = false;
		int length = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c >= 65 && c <= 90) {
				count[c - 65]++;
			} else {
				count[c - 71]++;
			}
		}

		for(int i : count) {
			if(i == 1) {
				sing = true;
			} else {
				length += (i/2)*2;
				if(i % 2 == 1)
					sing = true;		
			}
		}
		
		if(sing)
			length += 1;
		
		System.out.println("The longest length of palindrome is: " + length);
	}

}
