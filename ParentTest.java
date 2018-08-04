//Parent1 Class
public class Parent1 {
	String p1 = "This is an example ";
}

//Parent2 interface
public interface Parent2 {
	String p2 = "of interface and inheritance "; 
}

//Child class inheriting class Parent1 and implements interface Parent2
public class Child extends Parent1 implements Parent2{
	void add() {
		System.out.println(p1+""+p2);
	}
}

//This is main class
public class ParentTest {
	public static void main(String args[]) {
		Child child = new Child();
		child.add();
	
	}
}
