package first;
import java.util.*;
public class PascleIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of row: ");
		int numIndex = sc.nextInt();
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> temp = new LinkedList<>();
		List<Integer> n = new LinkedList<>();
		temp.add(1);
		temp.add(1);
		if(numIndex == 1) {
			ll.add(1);
		} else if(numIndex == 2) {
			ll.add(1);
			ll.add(1);
		} else {
			for(int i = 0; i < numIndex - 2; i++) {
				n.add(1);
				for(int j = 0; j < temp.size() - 1; j++) {
					n.add(temp.get(j) + temp.get(j + 1));
				}
				n.add(1);
				temp.clear();
				temp.addAll(n);
				n.clear();
			}
			ll.addAll(temp);
		}
		
		System.out.println(ll);
	}
}
