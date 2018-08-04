
//Parent Class base1
public class base1 {
	public base1(){				//Default Constructor
		
	}
	public base1(int i, int j) {		//Parameterised Constructor
		int a= i+j;
		System.out.println("This is parent class with "+a+" as value");
	}
}

//Class sub1 inherits class bsae1
public class sub1 extends base1 {
	
	public sub1() {				//Default Constructor
		//super();
		System.out.println("This is default constructor");
	}
	
	public sub1(int i) {			//Parameterised Constructor
		System.out.println("This is a constructor with "+i +" as value");
		
	}
	
	public sub1(int i, int j) {		//Parameterised Constructor
		super(i,j);
		System.out.println("This is a constructor with "+i+","+j +" as value");
		
	}
	
	
}

//Class baseTest 
public class baseTest {
	public static void main(String args[]) {
		sub1 sub = new sub1(1,2);
		sub1 subnew = new sub1(1);
	}
}
