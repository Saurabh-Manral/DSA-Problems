package first;
import java.util.Scanner;
import java.util.HashMap;
public class RansomNote {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ransom note: ");
		String ransomNote = sc.nextLine();
		System.out.println("Enter the magazine: ");
		String magazine = sc.nextLine();
		
		int[] count = new int[26];
		
		for(int i = 0; i < magazine.length(); i++) {
			count[magazine.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			if(count[c] == 0)
				System.out.println("false");
			else {
				count[c - 97]--;
			}
		}
	}
}
