package first;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
public class SudhirAviation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder vowels = new StringBuilder();

        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                vowels.append("" + c);
            }
        }

        vowels.reverse();
        int j = 0;
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
                sb.setCharAt(i, vowels.charAt(j++));
            }
        }
        
        System.out.println(sb);
	}
}

