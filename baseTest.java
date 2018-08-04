

public class base1 {
	public base1(){
		
	}
	public base1(int i, int j) {
		int a= i+j;
		System.out.println("This is parent class with "+a+" as value");
	}
}

public class sub1 extends base1 {
	
	public sub1() {
		//super();
		System.out.println("This is default constructor");
	}
	
	public sub1(int i) {
		System.out.println("This is a constructor with "+i +" as value");
		
	}
	
	public sub1(int i, int j) {
		super(i,j);
		System.out.println("This is a constructor with "+i+","+j +" as value");
		
	}
	
	
}

public class baseTest {
	public static void main(String args[]) {
		sub1 sub = new sub1(1,2);
		sub1 subnew = new sub1(1);
	}
}
