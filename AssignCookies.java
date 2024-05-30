package first;

public class AssignCookies {
	public static void main(String[] args)
	{
		
		int[] uppr = new int[25];
		int[] lowr = new int[122-97];
		String str = "Hello Welcome Here";
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if( c < 90) {
				uppr[c - 65]++;
			} else {
				lowr[c - 97]++;
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < uppr.length; i++) {
			if(max < uppr[i]) {
				max = i + 25;
			}
		}
		
		for(int i = 0; i < lowr.length; i++) {
			if(max < lowr[i]) {
				max = i + 120;
			}
		}
		
		System.out.println((char) max+1);
	}
	
}
