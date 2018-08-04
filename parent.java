import java.util.Scanner;

//Class Child inherits class Parent
public class child extends parent {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();
		int c = add(a,b);
		
		System.out.println("Sum in child class");
		System.out.println(c);
		
		parent parents = new parent();			
		int d = parents.add(a,b);		//Storing value in variable d after performing add operationclass
		System.out.println(d);
		
	}
	
	public static int add(int a,int b) {
		int c = a + b;
		return c;
	}
}

//Parent Class
public class parent {
	public static int add(int i, int j) {
		System.out.println("Sum in parent class");
		int k =i + j;
		return k;
	}
}
