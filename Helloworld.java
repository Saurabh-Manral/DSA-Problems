package first;
import java.util.*;
public class Helloworld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int numRows = sc.nextInt();
		
		List<List<Integer>> res = new LinkedList<>();
		
		
		if(numRows == 1) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(1);
			res.add(ll);
		} else if(numRows == 2) {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(1);
			res.add(ll);
			
			LinkedList<Integer> ll2 = new LinkedList<>();
			ll2.add(1);
			ll2.add(1);
			
			res.add(ll2);
		} else {
			LinkedList<Integer> ll = new LinkedList<>();
			ll.add(1);
			res.add(ll);
			
			LinkedList<Integer> ll2 = new LinkedList<>();
			ll2.add(1);
			ll2.add(1);
			
			res.add(ll2);
			
			for(int i = 2; i < numRows; i++) {
				LinkedList<Integer> lltemp = new LinkedList<>();
				lltemp.add(1);
				LinkedList<Integer> l = (LinkedList<Integer>) res.get(i - 1);
				for(int j = 0; j < l.size() - 1; j++) {
					lltemp.add(l.get(j) + l.get(j+1));
				}
				lltemp.add(1);
				res.add(lltemp);
			}
		}
		
		System.out.println(res);
	}
}
