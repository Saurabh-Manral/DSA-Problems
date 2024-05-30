package impquestions;

public class Practice {
	
	public static void main(String[] args) {
		Demo dm = new Demo();
		dm.meth(21);
	}
	
}

class Demo {
	public void meth(int val){
		if(val > 10) {
			throw new MyException("this is unchacked exception");
		} else {
			System.out.println("The valeu of val is " + 10);
		}
	}
}
